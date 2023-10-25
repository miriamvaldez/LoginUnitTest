public class Autenticador{
    private static final String usuario_correcto = "usuario";
    private static final String pass_correcto = "pass";

    public static boolean verificarCredenciales(Usuario usuario){
        return usuario_correcto.equals(usuario.getNombreUsuario()) && pass_correcto.equals(usuario.getPass());
    }
}