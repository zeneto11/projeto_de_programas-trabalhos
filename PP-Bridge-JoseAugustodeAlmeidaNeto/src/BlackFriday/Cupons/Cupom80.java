package BlackFriday.Cupons;

import BlackFriday.Roupas.*;

public class Cupom80 extends Cupons {

    public Cupom80(Roupas roupa) {
        this.roupa = roupa;
    }

    public void aplicarDesc() {
        double PrecoDesc = roupa.getPreco() - roupa.getPreco()*0.8;
        System.out.println("O preço da peça com 80% de desconto é: " + PrecoDesc);
        System.out.println("------------------------------------"); 
    }
    
}
