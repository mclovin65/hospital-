package controller;

import backend.ValidacionDatodds;
import view.DoctorView;
import view.LoginView;

import java.util.HashMap;

public class logincontroller {
    private LoginView loginView;

    public logincontroller(LoginView loginView) {
        this.loginView = loginView;
        initController();
    }

    public void initController() {
        loginView.getLoginButton().addActionListener(e -> iniciarsesion());
    }

    public void iniciarsesion() {
        ValidacionDatodds validar=new ValidacionDatodds();
        String usuario="Jfuentes";
        String contraseña="1234";

        HashMap<String,String> resultado=validar.validar(usuario,contraseña);

            String nombreDoctor=resultado.get("nombre");
            String especialidad =resultado.get("especialidad");

            DoctorView doctorView = new DoctorView(nombreDoctor, especialidad);
        }
    }
