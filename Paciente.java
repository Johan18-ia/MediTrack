package meditrack;

public class Paciente {
    private int id;
    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;
    
public Paciente(String nombre, String cedula, String telefono, String correo){
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
    }
    
public int getId(){return id;}
public String getNombre(){return nombre;}
public String getCedula(){return cedula;}
public String getCorreo(){return correo;}
public String getTelefono(){return telefono;}

public void setId(int id){this.id = id;}
public void setNombre(String nombre){this.nombre = nombre;}
public void setCedula(String cedula){this.cedula = cedula;}
public void setCorreo(String correo){this.nombre = correo;}
public void setTelefono(String telefono ){this.telefono = telefono;}

public void mostrarInfo(){
    System.out.println("Paciente: " + nombre);
    System.out.println("Tel: " + telefono + "Correo: " + correo);
}
}