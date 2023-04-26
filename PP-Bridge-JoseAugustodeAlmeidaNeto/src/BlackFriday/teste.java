package BlackFriday;

import BlackFriday.Roupas.Roupas;
import BlackFriday.Roupas.Camisa;
import BlackFriday.Roupas.Casaco;
import BlackFriday.Roupas.Short;
import BlackFriday.Cupons.Cupom10;
import BlackFriday.Cupons.Cupom50;
import BlackFriday.Cupons.Cupom80;

public class teste {
    public static void main(String[] args) {
        testeRoupa(new Camisa("azul", 69.99));
        testeRoupa(new Casaco("jeans", 129.99));
        testeRoupa(new Short("branco", 29.99));
    }

    public static void testeRoupa(Roupas roupa) {
        System.out.println("TESTE COM CUPOM DE 10%:");
        Cupom10 Cupom10 = new Cupom10(roupa);
        roupa.printInfo();
        Cupom10.aplicarDesc();

        System.out.println("TESTE COM CUPOM DE 50%:");
        Cupom50 Cupom50 = new Cupom50(roupa);
        roupa.printInfo();
        Cupom50.aplicarDesc();

        System.out.println("TESTE COM CUPOM DE 80%:");
        Cupom80 Cupom80 = new Cupom80(roupa);
        roupa.printInfo();
        Cupom80.aplicarDesc();
        
    }
    
}
