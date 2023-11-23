package br.com.infnet;

import br.com.infnet.package1.Gato;
import br.com.infnet.package2.Brincadeira;
import br.com.infnet.package2.BrincadeiraComBola;
import br.com.infnet.package3.Alimentacao;
import br.com.infnet.package3.AlimentacaoComRacao;

public class App
{
    public static void main( String[] args )
    {
        Gato gato = new Gato("Felix");
        Brincadeira brincadeira = new BrincadeiraComBola();
        String resultado = gato.brincar(brincadeira);

        System.out.println(resultado);

        Gato gato2 = new Gato("Garfield");
        Alimentacao alimentacao = new AlimentacaoComRacao();
        String alimentado = gato.alimentar(alimentacao);

        System.out.println(alimentado);
    }
}
