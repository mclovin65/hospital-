import backend.ValidacionDatodds;
import controller.logincontroller;
import view.DoctorView;
import view.loginview;

public class Main {
    public static void main(String[] args) {

        loginview loginView = new loginview();


        ValidacionDatodds validacionDatodds = new ValidacionDatodds();

        new logincontroller(loginView, validacionDatodds);
        loginView.setVisible(true);
    }}
