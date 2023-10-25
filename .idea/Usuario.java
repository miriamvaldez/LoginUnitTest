public class Usuario{
    private String nombreUsuario;
    private String pass;

    public Usuario(String nombreUsuario, String pass){
        this.nombreUsuario = nombreUsuario;
        this.pass = pass;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPass() {
        return pass;
    }
}