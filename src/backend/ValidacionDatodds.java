package backend;

import java.util.HashMap;

public class ValidacionDatodds {
    private DoctorDatabase doctorDatabase;

    public ValidacionDatodds() {
        doctorDatabase=new DoctorDatabase();
    }

    public HashMap<String, String> validar(String email, String contraseña) {
        HashMap<String, String> resultado = new HashMap<>();

        // Buscar el doctor en la base de datos
        for (dataDoc doctor : doctorDatabase.getDoctors()) {
            if (doctor.getEmail().equals(email) && doctor.getPassword().equals(contraseña)) {
                resultado.put("nombre", doctor.getNombre());
                resultado.put("especialidad", doctor.getEspecialidad());
                break;
            }
        }

        return resultado;
    }
}

