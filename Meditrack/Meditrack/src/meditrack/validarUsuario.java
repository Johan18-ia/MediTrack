package meditrack;
// Clase para validar usuarios
public class validarUsuario {
    public boolean validar(String Gmail, String contrasena) {
        if (Gmail == null || contrasena == null) {
            return false;
        }
        if (Gmail.isEmpty() || contrasena.isEmpty()) {
            return false; 
        }
        return true;
    }

    // usuarios predefinidos para pruebas
    public boolean autenticar(String Gmail, String contrasena) {
        String usuario1Gmail = "lolmandere@gmail.com";
        String usuario1Contrasena = "12345";
        String usuario2Gmail = "pepe@gmail.com";
        String usuario2Contrasena = "67890";

        return (usuario1Gmail.equals(Gmail) && usuario1Contrasena.equals(contrasena)) ||
                (usuario2Gmail.equals(Gmail) && usuario2Contrasena.equals(contrasena));
    }
}
