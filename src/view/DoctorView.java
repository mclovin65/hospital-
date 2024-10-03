package view;

import backend.medicamento;
import backend.datafarmacia;
import backend.datapa;
import backend.datasalas;
import backend.pacientedatabase;
import backend.sala;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DoctorView extends JFrame {
    private datapa db;
    private JLabel nombreDoctorLabel;
    private JLabel especialidadLabel;
    private ArrayList<sala> listasalas;
    private ArrayList<medicamento> listamedicamentos;
    private int[] pantalla = {1300, 800};
    private JPanel panelCentro; // Panel central para cambiar dinámicamente

    public DoctorView(String nombreDoctor, String especialidad, pacientedatabase pacienteDB) {
        // Configuración básica del JFrame
        setTitle("Hospital Santa Catalina - Perfil del doctor");
        setSize(pantalla[0], pantalla[1]);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel Header
        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new BorderLayout());

        // JLabel para el nombre del hospital
        JLabel hospitalLabel = new JLabel("Hospital Santa Catalina");
        hospitalLabel.setForeground(Color.WHITE);
        hospitalLabel.setFont(new Font("Arial", Font.BOLD, 20));
        hospitalLabel.setHorizontalAlignment(SwingConstants.LEFT);
        headerPanel.add(hospitalLabel, BorderLayout.WEST);

        // Información del doctor
        JPanel doctorInfoPanel = new JPanel();
        doctorInfoPanel.setLayout(new GridLayout(2, 1));
        doctorInfoPanel.setBackground(Color.DARK_GRAY);

        // Etiquetas para el nombre y especialidad del doctor
        nombreDoctorLabel = new JLabel("Nombre del doctor: " + nombreDoctor);
        nombreDoctorLabel.setForeground(Color.WHITE);
        especialidadLabel = new JLabel("Especialidad: " + especialidad);
        especialidadLabel.setForeground(Color.WHITE);

        // Inicializar salas y medicamentos
        datasalas datasalas = new datasalas();
        listasalas = datasalas.getListasalas();

        datafarmacia datafarmacia = new datafarmacia();
        listamedicamentos = (ArrayList<medicamento>) datafarmacia.getmedicamentos();

        doctorInfoPanel.add(nombreDoctorLabel);
        doctorInfoPanel.add(especialidadLabel);
        headerPanel.add(doctorInfoPanel, BorderLayout.EAST);
        add(headerPanel, BorderLayout.NORTH);

        // Añadir el menú lateral
        add(componentesMenuLateral(), BorderLayout.WEST);

        panelCentro = new JPanel(new BorderLayout());
        add(panelCentro, BorderLayout.CENTER);

        // Mostrar pacientes al inicio
        mostrarPacientes(pacienteDB);
    }

    private JPanel componentesMenuLateral() {
        JPanel menu = new JPanel();
        menu.setPreferredSize(new Dimension(250, pantalla[1]));
        menu.setBackground(Color.DARK_GRAY);
        menu.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;

        JPanel opciones = new JPanel();
        opciones.setLayout(new GridLayout(0, 1, 10, 10));

        // Agregamos las opciones del menú con sus acciones
        opciones.add(op("Consultas del día", e -> System.out.println("Consultas del día")));
        opciones.add(op("Salas", e -> mostrarSalas()));
        opciones.add(op("Farmacia", e -> mostrarmedicamentos()));
        opciones.add(op("Pacientes registrados", e -> System.out.println("Pacientes registrados")));
        opciones.add(op("Citar en otra área", e -> System.out.println("Citar en otra área")));

        menu.add(opciones);
        return menu;
    }

    private JButton op(String texto, java.awt.event.ActionListener actionListener) {
        JButton boton = new JButton(texto);
        boton.addActionListener(actionListener);
        return boton;
    }

    private void mostrarPacientes(pacientedatabase db) {
        ArrayList<datapa> listaPacientes = new ArrayList<>(db.getPacientes());
        pacientesView panelPacientes = new pacientesView(listaPacientes);

        panelCentro.removeAll();
        panelCentro.add(panelPacientes, BorderLayout.CENTER);

        revalidate();
        repaint();
    }

    // Método para mostrar las salas y también imprimir sus detalles
    private void mostrarSalas() {
        // Crear el panel de las salas
        salasview panelSalas = new salasview(listasalas);

        System.out.println("=== Detalles de las salas ===");
        for (sala sala : listasalas) {
            System.out.println("Sala Nombre: " + sala.getNombre());
            System.out.println("Estado de la sala: " + sala.getEstado());
            System.out.println("----------------------------");
        }

        panelCentro.removeAll();
        panelCentro.add(panelSalas, BorderLayout.CENTER);

        revalidate();
        repaint();
    }

    private void mostrarmedicamentos() {
        JPanel panelMedicamentos = new JPanel();
        panelMedicamentos.setLayout(new GridLayout(0, 7, 10, 10));

        // Añadir títulos de las columnas
        panelMedicamentos.add(new JLabel("Nombre"));
        panelMedicamentos.add(new JLabel("Dosis"));
        panelMedicamentos.add(new JLabel("Número de Lote"));
        panelMedicamentos.add(new JLabel("Principio Activo"));
        panelMedicamentos.add(new JLabel("Forma Farmacéutica"));
        panelMedicamentos.add(new JLabel("Indicaciones"));
        panelMedicamentos.add(new JLabel("Fecha de Caducidad"));

        // Ahora añadimos los datos de cada medicamento
        for (medicamento med : listamedicamentos) {
            panelMedicamentos.add(new JLabel(med.getNombre()));
            panelMedicamentos.add(new JLabel(med.getDosis()));
            panelMedicamentos.add(new JLabel(med.getNumeroLote()));
            panelMedicamentos.add(new JLabel(med.getPrincipioActivo()));
            panelMedicamentos.add(new JLabel(med.getFormaFarmaceutica()));
            panelMedicamentos.add(new JLabel(med.getIndicaciones()));
            panelMedicamentos.add(new JLabel(med.getFechaCaducidad().toString())); // Si es de tipo Date o LocalDate
        }

        panelCentro.removeAll();
        panelCentro.add(panelMedicamentos, BorderLayout.CENTER);

        revalidate();
        repaint();
    }
}






