package questao1;

import java.util.ArrayList;

public class Professor {
	private String nome;
	private String cpf;
	private String matricula;
	private String titulo;
	private String fone;
	private Departamento departamento;
	private ArrayList<Aluno> listaAluno;
	private Endereco endereco;
	
	public Professor (String nome, String cpf, String matricula, String titulo, String fone, Departamento departamento, ArrayList<Aluno> listaAluno, Endereco endereco) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setMatricula(matricula);
		this.setTitulo(titulo);
		this.setFone(fone);
		this.setDepartamento(new Departamento());
		this.setListaAluno(new ArrayList<Aluno>());
		this.setEndereco(new Endereco());
	}
	
	public Professor() {
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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}
	
	public void mostrarDadosProf() {
		System.out.println ("Nome: " + this.nome);
		System.out.println ("CPF: " + this.cpf);
		System.out.println ("Matrícula: " + this.matricula);
		System.out.println ("Título: " + this.titulo);
		System.out.println ("Fone: " + this.fone);
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public void addAluno(Aluno aluno) {
		this.listaAluno.add(aluno);
	}
	
	public void imprimirAlunos() {
		for (int i=0; i<this.listaAluno.size();i++) {
			System.out.println ("Nome: " + this.listaAluno.get(i).getNome());
		}
	}

	public ArrayList<Aluno> getListaAluno() {
		return listaAluno;
	}

	public void setListaAluno(ArrayList<Aluno> listaAluno) {
		this.listaAluno = listaAluno;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
}