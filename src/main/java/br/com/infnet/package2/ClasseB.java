package br.com.infnet.package2;

import br.com.infnet.package1.ClasseA;
import lombok.Data;

@Data
public class ClasseB {
    private String nome;

    public void metodoB(){
        ClasseA classeA = new ClasseA("teste");
        System.out.println("O nome da classeA é: " + classeA.getNome());
        System.out.println("Método B da ClasseB");
    }
}
