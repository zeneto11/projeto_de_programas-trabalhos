package BlackFriday.Roupas;

public class Casaco implements Roupas{
    private String cor;
    private double preco;

    public Casaco(String cor, double preco) {
        this.cor = cor;
        this.preco = preco;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void printInfo() {
        System.out.println("------------------------------------");
        System.out.println("Casaco "  + this.getCor());
		System.out.println("Preço original: "+this.getPreco());
    }


}
