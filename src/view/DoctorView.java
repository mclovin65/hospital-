package view;
import javax.swing.*;
import java.awt.*;

public class DoctorView extends JFrame {
private JLabel nombreDoctorlabel;
private JLabel especialidad;

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

        // Etiqueta para el nombre del doctor
        JLabel doctorNameLabel = new JLabel("nombre del doctor;"+ nombreDoctor);
        doctorNameLabel.setFont(new Font("Arial", Font.BOLD, 17));
        doctorNameLabel.setForeground(Color.WHITE);
        doctorNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        doctorInfoPanel.add(doctorNameLabel);

        // Etiqueta para la especialidad del doctor
        JLabel doctorSpecialtyLabel = new JLabel("especialidad"+especialidad);
        doctorSpecialtyLabel.setFont(new Font("Arial", Font.PLAIN, 14
        ));
        doctorSpecialtyLabel.setForeground(Color.WHITE);
        doctorSpecialtyLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        doctorInfoPanel.add(doctorSpecialtyLabel);

        // Añadir el panel con la información del doctor al lado derecho
        headerPanel.add(doctorInfoPanel, BorderLayout.EAST);

        // Añadir headerPanel al norte
        add(headerPanel, BorderLayout.NORTH);

        // Panel para la representación del usuario (userPanel)
        JPanel userPanel = new JPanel();
        userPanel.setLayout(new GridBagLayout());

        // Añadir el panel de usuario al centro
        add(userPanel, BorderLayout.CENTER);
    }


}


