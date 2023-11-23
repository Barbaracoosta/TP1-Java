package br.com.infnet.package2;

// Classe que implementa uma brincadeira com bola
public class BrincadeiraComBola implements Brincadeira {
    @Override
    public String realizarBrincadeira(String nome) {
        return nome + " está brincando com uma bola.";
    }
}