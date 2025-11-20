package meditrack;

public class iniciarSesion {
    public static boolean login(String usuario, String password){
        String usuarioCorrecto = "analaba@gmail.com";
        String passwordCorrecto = "0422";
        return usuario.equals(usuarioCorrecto) && password.equals(passwordCorrecto);
    }

}
