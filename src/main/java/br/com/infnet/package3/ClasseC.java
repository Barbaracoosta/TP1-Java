package br.com.infnet.package3;

import br.com.infnet.package1.ClasseA;
import br.com.infnet.package2.ClasseB;
import lombok.Data;
import lombok.Getter;

@Data
public class ClasseC {
    private String nome;
    public void metodoC() {
        ClasseB classeB = new ClasseB();
        classeB.metodoB();
        System.out.println("O nome da classeB é: " + classeB.getNome());
        System.out.println("Método C da ClasseC");
    }
}
