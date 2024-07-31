package metodos;
import javax.swing.*;
import java.awt.*;

public class login extends JFrame {
    public login() {
        setTitle("Rockema");
        setSize(1800, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.setBackground(Color.blue);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.white);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());  // Cambiar a GridBagLayout
        panel2.setBackground(Color.white);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);  // Espaciado entre componentes
        gbc.anchor = GridBagConstraints.CENTER;   // Centrar componentes

        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel emailLabel = new JLabel("Correo:");
        panel2.add(emailLabel, gbc);

        gbc.gridx = 1;
        JTextField emailField = new JTextField(20);  // Ancho del campo de texto
        panel2.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel passwordLabel = new JLabel("Contraseña:");
        panel2.add(passwordLabel, gbc);

        gbc.gridx = 1;
        JPasswordField passwordField = new JPasswordField(20);  // Ancho del campo de contraseña
        panel2.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;  // Hacer el botón más ancho
        JButton loginButton = new JButton("Login");
        panel2.add(loginButton, gbc);

        mainPanel.add(panel1);
        mainPanel.add(panel2);

        add(mainPanel, BorderLayout.CENTER);

        SwingUtilities.invokeLater(() -> new login().setVisible(true));
    }
}





