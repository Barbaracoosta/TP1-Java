package br.com.infnet;

import br.com.infnet.package1.ClasseA;
import br.com.infnet.package2.ClasseB;
import br.com.infnet.package3.ClasseC;

public class App
{
    public static void main( String[] args )
    {
        ClasseA classeA = new ClasseA();
        ClasseB classeB = new ClasseB();
        ClasseC classeC = new ClasseC();

        classeA.metodoA();
        classeB.metodoB();
        classeC.metodoC();
    }
}
