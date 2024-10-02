import backend.ValidacionDatodds;
import controller.logincontroller;
import view.DoctorView;
import view.LoginView;

public class Main {
    public static void main(String[] args) {

        LoginView loginView = new LoginView();


        ValidacionDatodds validacionDatodds = new ValidacionDatodds();

        new logincontroller(loginView, validacionDatodds);
        loginView.setVisible(true);
    }}


