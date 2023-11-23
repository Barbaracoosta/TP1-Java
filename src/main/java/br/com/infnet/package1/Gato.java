package br.com.infnet.package1;

import br.com.infnet.package2.Brincadeira;
import br.com.infnet.package3.Alimentacao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gato {
    private static final Logger logger = LoggerFactory.getLogger(Gato.class);
    private String nome;

    public String brincar(Brincadeira brincadeira) {
        logger.info("{} está brincando.", nome);
        return brincadeira.realizarBrincadeira(nome);
    }

    public String alimentar(Alimentacao alimentacao) {
        logger.debug("Alimentando {}.", nome);
        return alimentacao.fornecerComida(nome);
    }
}
