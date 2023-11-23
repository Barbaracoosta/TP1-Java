package br.com.infnet.pacote1;
import br.com.infnet.exception.GatoFamintoException;
import br.com.infnet.package1.Gato;
import br.com.infnet.package2.Brincadeira;
import br.com.infnet.package2.BrincadeiraComBola;
import br.com.infnet.package3.Alimentacao;
import br.com.infnet.package3.AlimentacaoComRacao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GatoTest {
    @Test
    void testBrincar() {
        Gato gato = new Gato("Felix");
        Brincadeira brincadeira = new BrincadeiraComBola();
        String resultado = gato.brincar(brincadeira);
        assertEquals("Felix está brincando com uma bola.", resultado);
    }

    @Test
    void testAlimentar() {
        Gato gato = new Gato("Garfield");
        Alimentacao alimentacao = new AlimentacaoComRacao();
        String resultado = gato.alimentar(alimentacao);
        assertEquals("Fornecendo ração para Garfield.", resultado);
    }

    @Test
    void testAlimentarComExcecao() {
        Gato gatoFaminto = new Gato("Scarlet");
        Alimentacao alimentacao = new AlimentacaoComRacao();
        assertThrows(GatoFamintoException.class, () -> gatoFaminto.alimentar(alimentacao));
    }
}
