import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Escolha ColetorDados ou EspecialistaLimpeza e complete 2 testes.
 * Um deles deve obrigatoriamente verificar registrarPagamento.
 */
public class OperadorTest {
    @Test
    void exemploEstruturaAaa() {
        ColetorDados c = new ColetorDados("Ana", "C001");
        double turnos = c.addTurnoExtra(1.0);
        assertEquals(0.0, turnos, 0.001,
                "este exemplo só ilustra AAA; substitua pelos seus 2 testes");
    }

    // TODO: criar 2 testes unitários (AAA + mensagem na asserção)
    // TODO: um deles deve testar registrarPagamento
}
