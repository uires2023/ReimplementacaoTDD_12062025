package tst;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import app.IRPF;
public class CadastroDependentesTest {
    private IRPF irpf;
    @Before
    public void setup() {
        irpf = new IRPF();
    }
    @Test
    public void testCadastrarUmDependente() {
        irpf.cadastrarDependente("Joao");
        assertEquals(189.59f, irpf.getDeducaoDependentes(), 0);
    }
    @Test
    public void testCadastrarDoisDependentes() {
        irpf.cadastrarDependente("Joao");
        irpf.cadastrarDependente("Maria");
        assertEquals(2 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }
    @Test
    public void testCadastrarTresDependentes() {
        irpf.cadastrarDependente("Joao");
        irpf.cadastrarDependente("Maria");
        irpf.cadastrarDependente("Jose");
        assertEquals(3 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }
    @Test
    public void testCadastrarCincoDependentes() {
        irpf.cadastrarDependente("Joao");
        irpf.cadastrarDependente("Maria");
        irpf.cadastrarDependente("Jose");
        irpf.cadastrarDependente("Maria Jose");
        irpf.cadastrarDependente("Jose Maria");
        assertEquals(5 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }
}
