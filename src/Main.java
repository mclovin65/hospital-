import controller.logincontroller;
import view.LoginView;

public class Main {
    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        loginView.setVisible(true);

        logincontroller controller = new logincontroller(loginView);

    }
}
