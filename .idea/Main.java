import java.util.Scanner;
public class Main {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre de usuario");
        String nombreUsuario = scanner.nextLine();

        System.out.println("Ingresa tu contraseña");
        String pass = scanner.nextLine();

        Usuario usuario = new Usuario(nombreUsuario, pass);
    }
}