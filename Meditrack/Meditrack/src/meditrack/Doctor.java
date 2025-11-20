package meditrack;

public class Doctor {
    private int id;
    private String nombre;
    private String especialidad;
    private String telefono;
    private String horario;

    public Doctor(String nombre, String especialidad, String telefono, String horario){
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.horario = horario;
    }

    public int getId(){return id;}
    public String getNombre(){return nombre;}
    public String getEspecialidad(){return especialidad;}
    public String getTelefono(){return telefono;}
    public String getHorario(){return horario;}

    public void setId(int id){this.id = id;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setEspecialidad(String especialidad){this.especialidad = especialidad;}
    public void setTelefono(String telefono){this.telefono = telefono;}
    public void setHorario(String horario){this.horario = horario;}

    public void mostrarInfo(){
        System.out.println("Doctor: " + nombre + "-" + especialidad);
        System.out.println("Telefono: " + telefono + "Horario: " + horario);
    }

}