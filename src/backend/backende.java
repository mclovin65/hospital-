package backend;
import backend.dataDoc;
import java.util.ArrayList;
import java.util.List;

public class backende {

        private List<dataDoc> doctors;

        public backende() {
            // Inicialización de la lista de doctores
            doctors = new ArrayList<>();
            doctors.add(new dataDoc("1", "Dr. Juan Pérez", "Cardiología", "juan.perez@hospital.com", "password123"));
            doctors.add(new dataDoc("2", "Dra. Ana Gómez", "Dermatología", "ana.gomez@hospital.com", "securePass456"));
        }

        public String validarDatos(String email, String password) {
            // Validación de entrada
            if (email == null || email.isEmpty()) {
                return "El email no puede estar vacío.";
            }
            if (password == null || password.isEmpty()) {
                return "La contraseña no puede estar vacía.";
            }

            // Validación de credenciales
            for (dataDoc doc : doctors) {
                if (doc.getEmail().equals(email)) {
                    if (doc.getPassword().equals(password)) {
                        return "Inicio de sesión exitoso.";
                    } else {
                        return "Contraseña incorrecta.";
                    }
                }
            }
            return "Usuario no encontrado.";
        }}
