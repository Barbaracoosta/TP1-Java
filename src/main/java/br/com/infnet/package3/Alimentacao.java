package br.com.infnet.package3;

import br.com.infnet.exception.GatoFamintoException;

public interface Alimentacao {

    String fornecerComida(String nome) throws GatoFamintoException;

}
