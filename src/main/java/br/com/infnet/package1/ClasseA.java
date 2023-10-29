package br.com.infnet.package1;

import br.com.infnet.package3.ClasseC;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClasseA {
    private String nome;
    public void metodoA() {
        ClasseC classeC = new ClasseC();
        classeC.setNome("Java");
        System.out.println("O nome da classeC é: " + classeC.getNome());
        System.out.println("Método A da ClasseA");
    }
}
