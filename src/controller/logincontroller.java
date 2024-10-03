package controller;

import backend.ValidacionDatodds;
import backend.pacientedatabase;
import view.DoctorView;
import view.LoginView;
import backend.datafarmacia;

import java.util.HashMap;

public class logincontroller {
    private LoginView loginView;
    private ValidacionDatodds validacionDatodds;
    private pacientedatabase pacienteDB; // Añade la instancia de pacientedatabase

    public logincontroller(LoginView loginView, ValidacionDatodds validacionDatodds) {

        this.loginView = loginView;
        this.validacionDatodds = validacionDatodds;
        this.pacienteDB = new pacientedatabase();
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
            Object m;
            DoctorView doctorView = new DoctorView(nombreDoctor, especialidad, pacienteDB);
            doctorView.setVisible(true);
        }
    }
}



