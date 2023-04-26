package pk_questao1;

public class Carro {
	private String numChassi;
    private Double velocidadeMaxima;
    private Double quilometragem;
    private Double potencia;
    private String cor;
    private int qtdePortas;
 
    public Carro(String numChassi, Double velocidadeMaxima, Double quilometragem, Double potencia, String cor, int qtdePortas){
        this.numChassi = numChassi;
        this.velocidadeMaxima = velocidadeMaxima;
        this.quilometragem = quilometragem;
        this.potencia = potencia;
        this.cor = cor;
        this.qtdePortas = qtdePortas;
    }
    public String getNumChassi() {
    	return this.numChassi;
     }
	public Double getVelocidadeMaxima() {
		return this.velocidadeMaxima;
	 }
	public Double getQuilometragem() {
		return this.quilometragem;
	 }
	public Double getPotencia() {
		return this.potencia;
	 }
	public String getCor() {
		return this.cor;
	 }
	public int getQtdePortas() {
		return this.qtdePortas;
	 }
	public void setLigar() {
		System.out.println("Ligando o carro");
        System.out.println("O carro ligou");
	}
	public void setDesligar() {
		System.out.println("Desligando o carro");
        System.out.println("O carro desligou");
	}
	public void setAcelerar() {
        System.out.println("Acelerando o carro");
    }
    public void setFrear() {
        System.out.println("Freando o carro");
    }
    public void setGirarVolante() {
        System.out.println("Alterando a direcao do carro");
    }
    public void setReduzirMarcha() {
        System.out.println("Reduzindo a marcha do carro");
        System.out.println("Marcha reduzida");
    }
	
}