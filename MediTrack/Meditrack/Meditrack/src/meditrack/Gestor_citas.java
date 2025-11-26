package meditrack;

import java.util.ArrayList;

public class Gestor_citas {

    private ArrayList<Cita> citas = new ArrayList<>();

    public void crearCita(String id, String paciente, String medico, String fecha) {
        Cita nueva = new Cita(id, paciente, medico, fecha);
        citas.add(nueva);
        System.out.println("Cita creada correctamente.");
    }

    public void listarCitas() {
        System.out.println("LISTA DE CITAS");

        if (citas.isEmpty()) {
            System.out.println("No hay citas registradas.");
            return;
        }

        for (Cita c : citas) {
            System.out.println(
                "ID: " + c.getidCita() +
                " | Paciente: " + c.getiNombrePaciente() +
                " | Medico: " + c.getnombreMedico() +
                " | Fecha: " + c.getfecha()
            );
        }
    }
}



