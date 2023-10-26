import org.junit.jupiter.api.Test;
import static org.junit.jupiter.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MainTest{
    @Test
    public void testVerificarCredencialesValidas(){
        assertTrue(Autenticador.verificarCredenciales(new Usuario("usuario", "pass")));
    }

    @Test
    public void testVerificarCredencialesInvalidas(){
        assertFalse(Autenticador.verificarCredenciales(new Usuario("usuario", "incorrecto")));
    }

    @Test
    public void testMain(){
        String input = "usuario\ncontraseña\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        final String expectedOutput = "Inicio de sesión exitoso. Bienvenido usuario!";
        assertEquals(expectedOutput, Main.main(new String[]{}));
    }
}