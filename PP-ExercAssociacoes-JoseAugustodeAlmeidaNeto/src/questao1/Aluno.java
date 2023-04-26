package questao1;

public class Aluno {
	private String nome;
	private String cpf;
	private String matricula;
	private Endereco endereco;
	
	public Aluno (String nome, String cpf, String matricula, Endereco endereco) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setMatricula(matricula);
		this.setEndereco(new Endereco(endereco.getRua(), endereco.getNumero(), endereco.getBairro(), endereco.getCep(), endereco.getCidade(), endereco.getEstado()));
	}
	
	public Aluno () {	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void mostrarDadosAluno() {
		System.out.println ("Nome: " + this.nome);
		System.out.println ("CPF: " + this.cpf);
		System.out.println ("Matrícula: " + this.matricula);
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
}