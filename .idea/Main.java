import java.util.Scanner;
public class Main {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre de usuario");
        String nombreUsuario = scanner.nextLine();

        System.out.println("Ingresa tu contraseña");
        String pass = scanner.nextLine();

        Usuario usuario = new Usuario(nombreUsuario, pass);

        if (Autenticador.verificarCredenciales(usuario)) {
            System.out.println("Inicio de sesión correcto. Bienvenido de vuelta "
                    + nombreUsuario +"!");
        }else{
            System.out.println("Credenciales incorrectas. El programa se cerrará");
        }

        scanner.close();
    }
}