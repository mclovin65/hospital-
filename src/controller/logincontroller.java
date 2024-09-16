package controller;

import view.LoginView;

public class logincontroller {
    private LoginView loginView;

    public logincontroller(LoginView loginView) {
        this.loginView = loginView;
        initController();
    }

    public void initController() {
        loginView.getLoginButton().addActionListener(e -> controllerLogin());
    }

    public void controllerLogin() {
        String email = loginView.getEmailField().getText();
        String password = new String(loginView.getPasswordField().getPassword());

        System.out.println("Correo: " + email);
        System.out.println("Contraseña: " + password);

    }
}
