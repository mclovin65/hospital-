package backend;

import java.util.ArrayList;
import java.util.List;

public class DoctorDatabase { // Asegúrate de que la clase es pública
    private List<dataDoc> doctors;

    public DoctorDatabase() {
        doctors = new ArrayList<>();
        // Agrega los doctores de ejemplo
        doctors.add(new dataDoc("1", "Josue Fuentes", "Doctor General", "jfuentes@mail.com", "1234"));
        doctors.add(new dataDoc("2", "Fogel", "Cardiologo", "fgro@gmail.com", "1234"));
        doctors.add(new dataDoc("3", "Minor", "Pediatra", "mnorg@gmail.com", "1234"));
    }

    public List<dataDoc> getDoctors() {
        return doctors;
    }
}
