package questao1;

public class Endereco {
	private String rua;
	private Integer numero;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	
	public Endereco (String rua, Integer numero, String bairro, String cep, String cidade, String estado) {
		this.setRua(rua);
		this.setNumero(numero);
		this.setBairro(bairro);
		this.setCep(cep);
		this.setCidade("Manaus");
		this.setEstado("AM");
	}
	
	public Endereco() {		
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void mostrarEndereco() {
		System.out.println ("Rua: " + this.rua);
		System.out.println ("Número: " + this.numero);
		System.out.println ("Bairro: " + this.bairro);
		System.out.println ("CEP: " + this.cep);
		System.out.println ("Cidade: " + this.cidade);
		System.out.println ("Estado: " + this.estado);
	}
}
