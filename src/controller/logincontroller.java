package controller;

import backend.ValidacionDatodds;
import backend.pacientedatabase; // Asegúrate de importar la clase
import view.DoctorView;
import view.LoginView;

import java.util.HashMap;

public class logincontroller {
    private LoginView loginView;
    private ValidacionDatodds validacionDatodds;
    private pacientedatabase pacienteDB; // Añade la instancia de pacientedatabase

    public logincontroller(LoginView loginView, ValidacionDatodds validacionDatodds) {
        this.loginView = loginView;
        this.validacionDatodds = validacionDatodds;
        this.pacienteDB = new pacientedatabase(); // Inicializa la base de datos de pacientes
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



