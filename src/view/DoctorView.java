package view;

import backend.datapa;
import backend.pacientedatabase;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DoctorView extends JFrame {
    private JLabel nombreDoctorLabel;
    private JLabel especialidadLabel;
    private int[] pantalla = {1300, 800};

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

        doctorInfoPanel.add(nombreDoctorLabel);
        doctorInfoPanel.add(especialidadLabel);
        headerPanel.add(doctorInfoPanel, BorderLayout.EAST);
        add(headerPanel, BorderLayout.NORTH);

        // Añadir el menú lateral
        add(componentesMenuLateral(), BorderLayout.WEST);

add(mostrarPacientes(pacienteDB),BorderLayout.CENTER);
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
        opciones.add(op("Opción 1"));
        opciones.add(op("Opción 2"));
        opciones.add(op("Opción 3"));
        opciones.add(op("Opción 4"));
        opciones.add(op("Opción 5"));

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

    private JPanel mostrarPacientes(pacientedatabase db) {

        ArrayList<datapa> listaPacientes = new ArrayList<>(db.getPacientes());


        pacientesView panelPacientes = new pacientesView(listaPacientes);

        add(panelPacientes, BorderLayout.CENTER);
        return panelPacientes;
    }
}

