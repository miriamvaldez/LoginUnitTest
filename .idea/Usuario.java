public class Usuario{
    private String nombreUsuario;
    private String pass;

    public Usuario(String nombreUsario, String pass){
        this.nombreUsuario = nombreUsario;
        this.pass = pass;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPass() {
        return pass;
    }
}