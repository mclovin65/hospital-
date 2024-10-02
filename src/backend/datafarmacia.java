package backend;
import  java.time.LocalDate;
import  java.util.ArrayList;
import java.util.List;
public class datafarmacia {
    private List<medicamento>medicamentos;

    public datafarmacia(){
        medicamentos=new ArrayList<>();
       agregarmedicamento();
    }
    private void agregarmedicamento(){
        for (int i =1;1<=40;i++){
            medicamento med=new medicamento(
                    medicamentos.add(new medicamento(
                            "Medicamento 2", "Jarabe", "20ml", "Principio Activo 2",
                            LocalDate.now().plusYears(2), "Lote2", 15.00, "Indicaciones 2", "Contraindicaciones 2"));

            medicamentos.add(new medicamento(
                    "Medicamento 2", "Jarabe", "20ml", "Principio Activo 2",
                    LocalDate.now().plusYears(2), "Lote2", 15.00, "Indicaciones 2", "Contraindicaciones 2"));

            medicamentos.add(new medicamento(
                    "Medicamento 3", "Inyección", "5ml", "Principio Activo 3",
                    LocalDate.now().plusYears(2), "Lote3", 25.00, "Indicaciones 3", "Contraindicaciones 3"));

            medicamentos.add(new medicamento(
                    "Medicamento 4", "Tableta", "50mg", "Principio Activo 4",
                    LocalDate.now().plusYears(2), "Lote4", 12.00, "Indicaciones 4", "Contraindicaciones 4"));

            medicamentos.add(new medicamento(
                    "Medicamento 5", "Crema", "15g", "Principio Activo 5",
                    LocalDate.now().plusYears(2), "Lote5", 30.00, "Indicaciones 5", "Contraindicaciones 5"));

            // Medicamentos 6-10
            medicamentos.add(new medicamento(
                    "Medicamento 6", "Tableta", "100mg", "Principio Activo 6",
                    LocalDate.now().plusYears(2), "Lote6", 18.00, "Indicaciones 6", "Contraindicaciones 6"));

            medicamentos.add(new medicamento(
                    "Medicamento 7", "Jarabe", "30ml", "Principio Activo 7",
                    LocalDate.now().plusYears(2), "Lote7", 20.00, "Indicaciones 7", "Contraindicaciones 7"));

            medicamentos.add(new medicamento(
                    "Medicamento 8", "Inyección", "10ml", "Principio Activo 8",
                    LocalDate.now().plusYears(2), "Lote8", 50.00, "Indicaciones 8", "Contraindicaciones 8"));

            medicamentos.add(new medicamento(
                    "Medicamento 9", "Tableta", "150mg", "Principio Activo 9",
                    LocalDate.now().plusYears(2), "Lote9", 45.00, "Indicaciones 9", "Contraindicaciones 9"));

            medicamentos.add(new medicamento(
                    "Medicamento 10", "Crema", "20g", "Principio Activo 10",
                    LocalDate.now().plusYears(2), "Lote10", 35.00, "Indicaciones 10", "Contraindicaciones 10"));

            // Medicamentos 11-20
            medicamentos.add(new medicamento(
                    "Medicamento 11", "Tableta", "200mg", "Principio Activo 11",
                    LocalDate.now().plusYears(2), "Lote11", 22.00, "Indicaciones 11", "Contraindicaciones 11"));

            medicamentos.add(new medicamento(
                    "Medicamento 12", "Jarabe", "50ml", "Principio Activo 12",
                    LocalDate.now().plusYears(2), "Lote12", 27.00, "Indicaciones 12", "Contraindicaciones 12"));

            medicamentos.add(new medicamento(
                    "Medicamento 13", "Inyección", "15ml", "Principio Activo 13",
                    LocalDate.now().plusYears(2), "Lote13", 60.00, "Indicaciones 13", "Contraindicaciones 13"));

            medicamentos.add(new medicamento(
                    "Medicamento 14", "Tableta", "250mg", "Principio Activo 14",
                    LocalDate.now().plusYears(2), "Lote14", 50.00, "Indicaciones 14", "Contraindicaciones 14"));

            medicamentos.add(new
                    medicamento(
                    "Medicamento 15", "Crema", "25g", "Principio Activo 15",
                    LocalDate.now().plusYears(2), "Lote15", 40.00, "Indicaciones 15", "Contraindicaciones 15"));

            medicamentos.add(new medicamento(
                    "Medicamento 16", "Tableta", "300mg", "Principio Activo 16",
                    LocalDate.now().plusYears(2), "Lote16", 55.00, "Indicaciones 16", "Contraindicaciones 16"));

            medicamentos.add(new medicamento(
                    "Medicamento 17", "Jarabe", "75ml", "Principio Activo 17",
                    LocalDate.now().plusYears(2), "Lote17", 32.00, "Indicaciones 17", "Contraindicaciones 17"));

            medicamentos.add(new medicamento(
                    "Medicamento 18", "Inyección", "20ml", "Principio Activo 18",
                    LocalDate.now().plusYears(2), "Lote18", 65.00, "Indicaciones 18", "Contraindicaciones 18"));

            medicamentos.add(new medicamento(
                    "Medicamento 19", "Tableta", "350mg", "Principio Activo 19",
                    LocalDate.now().plusYears(2), "Lote19", 70.00, "Indicaciones 19", "Contraindicaciones 19"));

            medicamentos.add(new medicamento(
                    "Medicamento 20", "Crema", "30g", "Principio Activo 20",
                    LocalDate.now().plusYears(2), "Lote20", 45.00, "Indicaciones 20", "Contraindicaciones 20"));

            // Medicamentos 21-30
            medicamentos.add(new medicamento(
                    "Medicamento 21", "Tableta", "400mg", "Principio Activo 21",
                    LocalDate.now().plusYears(2), "Lote21", 75.00, "Indicaciones 21", "Contraindicaciones 21"));

            medicamentos.add(new medicamento(
                    "Medicamento 22", "Jarabe", "100ml", "Principio Activo 22",
                    LocalDate.now().plusYears(2), "Lote22", 85.00, "Indicaciones 22", "Contraindicaciones 22"));

            medicamentos.add(new medicamento(
                    "Medicamento 23", "Inyección", "25ml", "Principio Activo 23",
                    LocalDate.now().plusYears(2), "Lote23", 90.00, "Indicaciones 23", "Contraindicaciones 23"));

            medicamentos.add(new medicamento(
                    "Medicamento 24", "Tableta", "450mg", "Principio Activo 24",
                    LocalDate.now().plusYears(2), "Lote24", 100.00, "Indicaciones 24", "Contraindicaciones 24"));

            medicamentos.add(new medicamento(
                    "Medicamento 25", "Crema", "35g", "Principio Activo 25",
                    LocalDate.now().plusYears(2), "Lote25", 110.00, "Indicaciones 25", "Contraindicaciones 25"));

            // Continuar con los demás medicamentos hasta llegar a 40
            medicamentos.add(new medicamento(
                    "Medicamento 26", "Tableta", "500mg", "Principio Activo 26",
                    LocalDate.now().plusYears(2), "Lote26", 120.00, "Indicaciones 26", "Contraindicaciones 26"));

            medicamentos.add(new medicamento(
                    "Medicamento 27", "Jarabe", "125ml", "Principio Activo 27",
                    LocalDate.now().plusYears(2), "Lote27", 130.00, "Indicaciones 27", "Contraindicaciones 27"));

            medicamentos.add(new medicamento(
                    "Medicamento 28", "Inyección", "30ml", "Principio Activo 28",
                    LocalDate.now().plusYears(2), "Lote28", 140.00, "Indicaciones 28", "Contraindicaciones 28"));

            medicamentos.add(new medicamento(
                    "Medicamento 29", "Tableta", "550mg", "Principio Activo 29",
                    LocalDate.now().plusYears(2), "Lote29", 150.00, "Indicaciones 29", "Contraindicaciones 29"));

            medicamentos.add(new medicamento(
                    "Medicamento 30", "Crema", "40g", "Principio Activo 30",
                    LocalDate.now().plusYears(2), "Lote30", 160.00, "Indicaciones 30", "Contraindicaciones 30"));


            medicamentos.add(new medicamento(
                    "Medicamento 2", "Jarabe", "20ml", "Principio Activo 2",
                    LocalDate.now().plusYears(2), "Lote2", 15.00, "Indicaciones 2", "Contraindicaciones 2"));

            medicamentos.add(new medicamento(
                    "Medicamento 3", "Inyección", "5ml", "Principio Activo 3",
                    LocalDate.now().plusYears(2), "Lote3", 25.00, "Indicaciones 3", "Contraindicaciones 3"));

            medicamentos.add(new medicamento(
                    "Medicamento 4", "Tableta", "50mg", "Principio Activo 4",
                    LocalDate.now().plusYears(2), "Lote4", 12.00, "Indicaciones 4", "Contraindicaciones 4"));

            medicamentos.add(new medicamento(
                    "Medicamento 5", "Crema", "15g", "Principio Activo 5",
                    LocalDate.now().plusYears(2), "Lote5", 30.00, "Indicaciones 5", "Contraindicaciones 5"));

            // Medicamentos 6-10
            medicamentos.add(new medicamento(
                    "Medicamento 6", "Tableta", "100mg", "Principio Activo 6",
                    LocalDate.now().plusYears(2), "Lote6", 18.00, "Indicaciones 6", "Contraindicaciones 6"));

            medicamentos.add(new medicamento(
                    "Medicamento 7", "Jarabe", "30ml", "Principio Activo 7",
                    LocalDate.now().plusYears(2), "Lote7", 20.00, "Indicaciones 7", "Contraindicaciones 7"));

            medicamentos.add(new medicamento(
                    "Medicamento 8", "Inyección", "10ml", "Principio Activo 8",
                    LocalDate.now().plusYears(2), "Lote8", 50.00, "Indicaciones 8", "Contraindicaciones 8"));

            medicamentos.add(new medicamento(
                    "Medicamento 9", "Tableta", "150mg", "Principio Activo 9",
                    LocalDate.now().plusYears(2), "Lote9", 45.00, "Indicaciones 9", "Contraindicaciones 9"));

            medicamentos.add(new medicamento(
                    "Medicamento 10", "Crema", "20g", "Principio Activo 10",
                    LocalDate.now().plusYears(2), "Lote10", 35.00, "Indicaciones 10", "Contraindicaciones 10"));
        }
    }
    public List<medicamento>getMedicamentos(){
        return medicamentos;
    }



}
