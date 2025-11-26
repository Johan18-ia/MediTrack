package meditrack;

import java.util.HashMap;
import java.util.Map;

public class validarUsuario {
    private static final Map<String, String> usuarios = new HashMap<>();
    static {
        usuarios.put("analaba@gmail.com", "0422");
        usuarios.put("kenya@gmail.com", "password");        
        usuarios.put("kenya@gmail.com", "password");
        }

    public static boolean validar(String usuario, String password) {
        if (usuario == null || password == null) return false;
        String pw = usuarios.get(usuario);
        return pw != null && pw.equals(password);
    }

    public static boolean existeUsuario(String usuario) {
        return usuarios.containsKey(usuario);
    }
}