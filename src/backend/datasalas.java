package backend;

import java.util.ArrayList;

public class datasalas {
    private ArrayList<sala>listasalas;
    public datasalas(){
        listasalas=new ArrayList<>();
        listasalas.add(new sala("quirofano", "En uso"));
        listasalas.add(new sala("pediatria", "Disponible"));
        listasalas.add(new sala("emergencias", "Fuera de servicio"));
        listasalas.add(new sala("urgencias", "En uso"));
        listasalas.add(new sala("sala de espera", "Disponible"));
        listasalas.add(new sala("ginecologia", "Fuera de servicio"));
        listasalas.add(new sala("odontologia", "En uso"));
        listasalas.add(new sala("sala de espera", "Disponible"));
        listasalas.add(new sala("neoruologia", "Fuera de servicio"));
        listasalas.add(new sala("morge", "Disponible"));
        listasalas.add(new sala("camillas", "En uso"));
        listasalas.add(new sala("pre operacion", "Disponible"));
    }
    public ArrayList<sala>getListasalas(){
        return listasalas;
    }
}
