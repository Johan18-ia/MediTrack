package meditrack;

public class notificacion {
    private String mensaje;
    private String fechaHora;

    public notificacion(String mensaje, String fechaHora){
        this.mensaje = mensaje;
        this.fechaHora = fechaHora;
    }

    public String getMensaje(){return mensaje;}
    public String getFechaHora(){return fechaHora;}

    // Método para enviar notificación a un usuario
    public void enviarAUsuario(String usuario) {
       
        System.out.println("Notificación para " + usuario + ": " + mensaje + " (" + fechaHora + ")");
    }
}
