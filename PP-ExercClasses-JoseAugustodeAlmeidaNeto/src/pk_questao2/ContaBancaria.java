package pk_questao2;

public class ContaBancaria {
	private Double saldo;
    private String dataAbertura;
    private String tipoConta;
    private Double valorManutencao;
 
    public ContaBancaria(Double saldo, String dataAbertura, String tipoConta, Double valorManutencao) {
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.tipoConta = tipoConta;
        this.valorManutencao = valorManutencao;
    }

	public String getDataAberturaFormatada() {
		return this.dataAbertura;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public String getTipoConta() {
		return this.tipoConta;
	}

	public Double getValorManutencao() {
		return this.valorManutencao;
	}
	public void setDepositar(Double d) {
        this.saldo = saldo + d;
    }
    public void setSacar(Double s) {
        this.saldo = saldo - s;
    }
}
