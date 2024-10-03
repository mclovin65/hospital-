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

    private JLabel nombreDoctorLabel;
    private JLabel especialidadLabel;
    private ArrayList<sala> listasalas;
    private ArrayList<medicamento> listamedicamentos;

    private int[] pantalla = {1300, 800};

    public DoctorView(String nombreDoctor, String especialidad) {
        // Configuración básica del JFrame con dimensiones desde el atributo pantalla
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

        // Crear un panel para el nombre del doctor y su especialidad (al lado derecho)
        JPanel doctorInfoPanel = new JPanel();
        doctorInfoPanel.setLayout(new GridLayout(2, 1));  // 2 filas, 1 columna
        doctorInfoPanel.setBackground(Color.DARK_GRAY);


        // Etiquetas para el nombre y especialidad del doctor
        nombreDoctorLabel = new JLabel("Nombre del doctor: " + nombreDoctor);
        nombreDoctorLabel.setForeground(Color.WHITE);
        especialidadLabel = new JLabel("Especialidad: " + especialidad);
        especialidadLabel.setForeground(Color.WHITE);

        // Initialize salas and medicamentos
        datasalas datasalas = new datasalas();
        listasalas = datasalas.getListasalas();

        datafarmacia datafarmacia=new datafarmacia();
        listamedicamentos= (ArrayList<medicamento>) datafarmacia.getmedicamentos();

        doctorInfoPanel.add(nombreDoctorLabel);
        doctorInfoPanel.add(especialidadLabel);
        // Etiqueta para el nombre del doctor
        JLabel doctorNameLabel = new JLabel("nombre del doctor;" + nombreDoctor);
        doctorNameLabel.setFont(new Font("Arial", Font.BOLD, 17));
        doctorNameLabel.setForeground(Color.WHITE);
        doctorNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        doctorInfoPanel.add(doctorNameLabel);

        // Etiqueta para la especialidad del doctor
        JLabel doctorSpecialtyLabel = new JLabel("especialidad" + especialidad);
        doctorSpecialtyLabel.setFont(new Font("Arial", Font.PLAIN, 14
        ));
        doctorSpecialtyLabel.setForeground(Color.WHITE);
        doctorSpecialtyLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        doctorInfoPanel.add(doctorSpecialtyLabel);

        // Añadir el panel con la información del doctor al lado derecho
    

    

        // Panel para la representación del usuario (userPanel)
        JPanel userPanel = new JPanel();
        userPanel.setLayout(new GridBagLayout());
 salasview
        panelCentro = new JPanel(new BorderLayout());
        add(panelCentro, BorderLayout.CENTER);
        // Añadir el panel de usuario al centro
        add(userPanel, BorderLayout.CENTER);
        add(headerPanel, BorderLayout.NORTH);
        add(componentesmenulateral(), BorderLayout.WEST);
    }



    private JPanel componentesmenulateral() {
        JPanel menu = new JPanel();
        menu.setPreferredSize(new Dimension(250, pantalla[1]));
        menu.setBackground(Color.darkGray);
        menu.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;




        JPanel opciones = new JPanel();
        opciones.setLayout(new GridLayout(0, 1, 10, 10));
 salasview

        // Agregamos las opciones del menú con sus acciones
        opciones.add(op("Consultas del día", e -> System.out.println("Consultas del día")));
        opciones.add(op("Salas", e -> mostrarSalas()));
        opciones.add(op("Farmacia", e -> mostrarmedicamentos()));
        opciones.add(op("Pacientes registrados", e -> System.out.println("Pacientes registrados")));
        opciones.add(op("Citar en otra área", e -> System.out.println("Citar en otra área")));

        opciones.add(op("opcion1"), gbc);
        opciones.add(op("opcion2"), gbc);
        opciones.add(op("opcion3"), gbc);
        opciones.add(op("opcion4"), gbc);
        opciones.add(op("opcion5"), gbc);


        menu.add(opciones);
        return menu;
    }

    private JButton op(String texto) {
        JButton op = new JButton(texto);
        op.addActionListener(e -> {
            System.out.println(texto);
        });
        return op;
    }

 
    private void mostrarPacientes(pacientedatabase db) {
        ArrayList<datapa> listaPacientes = new ArrayList<>(db.getPacientes());
        pacientesView panelPacientes = new pacientesView(listaPacientes);

        panelCentro.removeAll();
        panelCentro.add(panelPacientes, BorderLayout.CENTER);

        revalidate();
        repaint();
    }


    // Método para mostrar los medicamentos en la farmacia sin MedicamentoView
    private void mostrarMedicamentos() {
        datafarmacia farmacia = new datafarmacia();
        // Crear un panel para contener las etiquetas de los medicamentos
        JPanel panelMedicamentos = new JPanel();
        panelMedicamentos.setLayout(new GridLayout(0, 1));  // Layout de una columna para los medicamentos

        System.out.println("=== Lista de Medicamentos ===");
        for (medicamento med : listamedicamentos) {
            // Imprimir detalles en consola
            System.out.println("Nombre: " + med.getNombre());
            System.out.println("Dosis: " + med.getDosis());
            System.out.println("----------------------------");


            // Crear una etiqueta para mostrar el nombre y la dosis del medicamento en el panel
            JLabel labelMedicamento = new JLabel(med.getNombre() + " - Dosis: " + med.getDosis());
            panelMedicamentos.add(labelMedicamento);  // Añadir la etiqueta al panel
        }

        // Actualizar el panel central

        panelCentro.removeAll();
        panelCentro.add(new JScrollPane(panelMedicamentos), BorderLayout.CENTER);  // Agregar scroll si la lista es larga

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





}