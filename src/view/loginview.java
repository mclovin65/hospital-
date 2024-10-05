package view;

import javax.swing.*;
import java.awt.*;

public class loginview extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginbutton;

    public loginview() {
        // Configuración de la ventana
        setTitle("Login - Hospital Santa Catalina");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel superior para el título
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(70, 130, 180)); // Azul claro
        headerPanel.setPreferredSize(new Dimension(400, 50));

        JLabel titleLabel = new JLabel("Iniciar Sesión");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerPanel.add(titleLabel);

        // Añadir el panel del título a la parte superior
        add(headerPanel, BorderLayout.NORTH);

        // Panel central con el formulario
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        // Etiqueta de correo
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel emailLabel = new JLabel("Correo:");
        emailLabel.setFont(new Font("Arial", Font.BOLD, 14)); // Negrita y más grande
        formPanel.add(emailLabel, gbc);

        // Campo de texto de correo
        gbc.gridx = 1;
        emailField = new JTextField(20);
        emailField.setBorder(BorderFactory.createLineBorder(Color.GRAY)); // Borde gris
        formPanel.add(emailField, gbc);

        // Etiqueta de contraseña
        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 14)); // Negrita y más grande
        formPanel.add(passwordLabel, gbc);

        // Campo de texto de contraseña
        gbc.gridx = 1;
        passwordField = new JPasswordField(20);
        passwordField.setBorder(BorderFactory.createLineBorder(Color.GRAY)); // Borde gris
        formPanel.add(passwordField, gbc);

        // Botón de inicio de sesión
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER; // Centrar el botón
        loginbutton = new JButton("Iniciar Sesión");
        loginbutton.setFont(new Font("Arial", Font.BOLD, 14));
        loginbutton.setForeground(Color.WHITE);
        loginbutton.setBackground(new Color(70, 130, 180)); // Azul claro
        loginbutton.setFocusPainted(false); // Elimina el borde del foco
        loginbutton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // Espaciado dentro del botón

        // Efecto de hover para el botón
        loginbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginbutton.setBackground(new Color(100, 149, 237)); // Cambia el color al pasar el mouse
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginbutton.setBackground(new Color(70, 130, 180)); // Color original
            }
        });

        formPanel.add(loginbutton, gbc);

        // Añadir el formulario al centro de la ventana
        add(formPanel, BorderLayout.CENTER);

        // Panel inferior con un mensaje o espaciador
        JPanel footerPanel = new JPanel();
        footerPanel.setPreferredSize(new Dimension(400, 40));
        footerPanel.setBackground(Color.WHITE);
        JLabel footerLabel = new JLabel("Hospital Santa Catalina");
        footerLabel.setFont(new Font("Arial", Font.ITALIC, 12));
        footerLabel.setForeground(Color.GRAY);
        footerPanel.add(footerLabel);

        add(footerPanel, BorderLayout.SOUTH);
    }

    public JButton getLoginButton() {
        return loginbutton;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }
}



