package backend;
import backend.dataDoc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ValidacionDatodds {
private HashMap<String,String[]> doctores = new HashMap<>();
public  ValidacionDatodds(){
    doctores.put("fg",new String[]{"Josue Fuentes","general","1234"});

}
public  HashMap<String,String>validar(String usuario,String contraseña) {
    HashMap<String,String>resultado=new HashMap<>();

    if (doctores.containsKey(usuario) && doctores.get(usuario)[2].equals(contraseña)) {
        String[] datosDoctor = doctores.get(usuario);
        resultado.put("nombre", datosDoctor[0]);
        resultado.put("especialidad", datosDoctor[1]);

    } else {

        resultado.put("mensaje", "Usuario o contraseña incorrectos");
    }
  return resultado;
}
}