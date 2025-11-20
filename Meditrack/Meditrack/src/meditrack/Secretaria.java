package meditrack;

public class Secretaria {
    private String nombre;
    private String usuario;
    private String password;

    public Secretaria(){
        this.nombre = "Ana García";
        this.usuario = "ana";
        this.password = "0422";
    }

    public String getNombre(){return nombre;}
    public String getUsuario(){return usuario;}
    public String getPassword(){return password;}

    public boolean login(String usuario, String password){
        return this.usuario.equals(usuario)&& this.password.equals(password);
    }
}
