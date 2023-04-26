package questao2;

import java.util.ArrayList;


public class Departamento {
	private String nomeDpto;
	private ArrayList<Funcionario> listaFuncionario;
	
	public Departamento (String nomeDpto, ArrayList<Funcionario> listaFuncionario) {
		this.setNomeDpto(nomeDpto);
		this.setListaFuncionario(new ArrayList<Funcionario>());
	}
	
	public Departamento() {
	}

	public String getNomeDpto() {
		return nomeDpto;
	}

	public void setNomeDpto(String nomeDpto) {
		this.nomeDpto = nomeDpto;
	}

	public ArrayList<Funcionario> getListaFuncionario() {
		return listaFuncionario;
	}

	public void setListaFuncionario(ArrayList<Funcionario> listaFuncionario) {
		this.listaFuncionario = listaFuncionario;
	}
	
	public void addFuncionario(Funcionario funcionario) {
		this.listaFuncionario.add(funcionario);
	}
	
	public void removerFuncionario(Funcionario funcionario) {
		this.listaFuncionario.remove(funcionario);
	}
	
	public void imprimirFuncionario() {
		for (int i=0; i<this.listaFuncionario.size();i++) {
			System.out.println ("Nome do departamento: " + this.listaFuncionario.get(i).getNome());
		}
	}

}
