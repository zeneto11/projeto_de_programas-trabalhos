package questao2;

import java.sql.Date;

public class Funcionario {
	private String nome;
	private Float salario;
	private Date dataAdmissao;
	private Departamento departamento;

	public Funcionario (String nome, Float salario, Date dataAdmissao, Departamento departamento) {
		this.setNome(nome);
		this.setSalario(salario);
		this.setDataAdmissao(dataAdmissao);
		this.setDepartamento(departamento);
	}
	
	public Funcionario() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public void mudarSalario (float valor) {
		this.salario = salario + (salario * valor/100);
	}
	
	public void mostrarDadosFunc() {
		System.out.println("Nome: "+ this.nome + "Salário: "+ this.salario + "Data de admissão "+ this.dataAdmissao);
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
}
