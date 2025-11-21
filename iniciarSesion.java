package meditrack;

public class iniciarSesion {
    // ...existing code...
    public static boolean login(String usuario, String password){
        // delega la validación a validarUsuario
        return validarUsuario.validar(usuario, password);
    }

    public static void main(String[] args) {
        boolean ok = login("analaba@gmail.com", "0422");
        System.out.println(ok ? "Inicio de sesión exitoso." : "Inicio de sesión fallido.");
    }
    // ...existing code...
}

