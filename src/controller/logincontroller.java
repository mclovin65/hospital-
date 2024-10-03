package controller;

import backend.ValidacionDatodds;
import view.DoctorView;
import view.LoginView;
import backend.datafarmacia;

import java.util.HashMap;

public class logincontroller {
    private LoginView loginView;
    private ValidacionDatodds validacionDatodds;

    public logincontroller(LoginView loginView, ValidacionDatodds validacionDatodds) {

        this.loginView = loginView;
        this.validacionDatodds = validacionDatodds;
        initController();
    }

    public void initController() {
        loginView.getLoginButton().addActionListener(e -> iniciarsesion());
    }

    public void iniciarsesion() {
        String usuario = loginView.getEmailField().getText();
        String contraseña = new String(loginView.getPasswordField().getPassword());

        HashMap<String, String> resultado = validacionDatodds.validar(usuario, contraseña);

        if (!resultado.isEmpty()) {
            String nombreDoctor = resultado.get("nombre");
            String especialidad = resultado.get("especialidad");

            // Usar la instancia de pacientedatabase en lugar de listaPacientes
          
            DoctorView doctorView = new DoctorView(nombreDoctor, especialidad, pacienteDB);

            doctorView.setVisible(true);
        }
    }
}

