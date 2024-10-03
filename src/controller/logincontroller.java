package controller;

import backend.ValidacionDatodds;
import backend.pacientedatabase;
import view.DoctorView;
import view.loginview;

import java.util.HashMap;

public class logincontroller {
    private loginview loginview;
    private ValidacionDatodds validacionDatodds;
    private pacientedatabase pacienteDB; // Base de datos de pacientes

    public logincontroller(loginview loginView, ValidacionDatodds validacionDatodds) {
        this.loginview = loginView;
        this.validacionDatodds = validacionDatodds;
        this.pacienteDB = new pacientedatabase(); // Inicializar la base de datos de pacientes
        initController();
    }

    public void initController() {
        loginview.getLoginButton().addActionListener(e -> iniciarsesion());
    }

    public void iniciarsesion() {
        String usuario = loginview.getEmailField().getText();
        String contraseña = new String(loginview.getPasswordField().getPassword());

        HashMap<String, String> resultado = validacionDatodds.validar(usuario, contraseña);

        if (!resultado.isEmpty()) {
            String nombreDoctor = resultado.get("nombre");
            String especialidad = resultado.get("especialidad");

            // Crear y mostrar la vista del doctor
            DoctorView doctorView = new DoctorView(nombreDoctor, especialidad, pacienteDB);
            doctorView.setVisible(true);
        }
    }
}



