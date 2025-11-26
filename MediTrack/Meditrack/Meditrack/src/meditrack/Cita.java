package meditrack;

public class Cita {
    public String idCita;
    private String NombrePaciente;
    public String nombreMedico;
    public String fecha;

    public Cita(String idCita, String NombrePaciente,  String nombreMedico, String fecha) {
        this. idCita = idCita;
        this. NombrePaciente = NombrePaciente;
        this. nombreMedico = nombreMedico;
        this. fecha = fecha; 
    }

    public String getidCita () {
        return idCita;
    }

    public String getiNombrePaciente () {
        return NombrePaciente;
    }

    public String getnombreMedico () {
        return nombreMedico;
    }


    public String getfecha () {
        return fecha;
    }
}