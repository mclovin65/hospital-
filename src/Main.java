import controller.logincontroller;
import view.DoctorView;
import view.LoginView;

public class Main {
    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        loginView.setVisible(true);

        logincontroller logincontroller = new logincontroller(loginView);

        loginView.setVisible(true);
    }
}


