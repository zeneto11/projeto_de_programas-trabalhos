package BlackFriday.Cupons;

import BlackFriday.Roupas.*;

public class Cupom10 extends Cupons {
    public Cupom10(Roupas roupa) {
        this.roupa = roupa;
    }

    public void aplicarDesc() {
        double PrecoDesc = roupa.getPreco() - roupa.getPreco()*0.1;
        System.out.println("O preço da peça com 10% de desconto é: " + PrecoDesc);
        System.out.println("------------------------------------"); 
    }
    
}
