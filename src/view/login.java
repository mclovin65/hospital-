package view;
import javax.swing.*;
import java.awt.*;

public class login extends JFrame{
    public login(){
        setTitle("login");
        setSize(1000, 1000);

        setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.setBackground(Color.blue);



        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        panel2.setBackground(Color.white);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.anchor = GridBagConstraints.CENTER;

        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel email = new JLabel("Correo:");
        panel2.add(email, gbc);

        gbc.gridx = 1;
        JTextField emai = new JTextField(20);
        panel2.add(emai, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel passwo = new JLabel("Contraseña:");
        panel2.add(passwo, gbc);

        gbc.gridx = 1;
        JPasswordField passwordField = new JPasswordField(20);
        panel2.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        JButton loginButton = new JButton("Login");
        panel2.add(loginButton, gbc);


        mainPanel.add(panel2);

        add(mainPanel, BorderLayout.CENTER);


    }
}





