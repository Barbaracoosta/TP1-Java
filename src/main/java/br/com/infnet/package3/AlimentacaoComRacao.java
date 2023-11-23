package br.com.infnet.package3;

import br.com.infnet.exception.GatoFamintoException;
import br.com.infnet.package1.Gato;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlimentacaoComRacao implements Alimentacao {
    private static final Logger logger = LoggerFactory.getLogger(AlimentacaoComRacao.class);
    @Override
    public String fornecerComida(String nome) {

        if ("Scarlet".equals(nome)) {
            logger.error("Gato Faminto {}.", nome);
            throw new GatoFamintoException("Gato faminto! Forneça comida!");
        }

        return "Fornecendo ração para " + nome + ".";
    }
}
