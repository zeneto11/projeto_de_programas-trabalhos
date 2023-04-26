package BlackFriday.Cupons;

import BlackFriday.Roupas.*;

public class Cupom50 extends Cupons {

    public Cupom50(Roupas roupa) {
        this.roupa = roupa;
    }

    public void aplicarDesc() {
        double PrecoDesc = roupa.getPreco() - roupa.getPreco()*0.5;
        System.out.println("O preço da peça com 50% de desconto é: " + PrecoDesc);
        System.out.println("------------------------------------"); 
    }
    
}
