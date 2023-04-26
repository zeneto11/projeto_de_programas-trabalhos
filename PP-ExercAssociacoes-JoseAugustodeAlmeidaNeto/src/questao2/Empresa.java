package questao2;

import java.util.ArrayList;

public class Empresa {
	private String nomeEmp;
	private String cnpj;
	private ArrayList<Departamento> listaDepartamento;
	
	public Empresa (String nomeEmp, String cnpj, ArrayList<Departamento> listaDepartamento) {
		this.setNomeEmp(nomeEmp);
		this.setCnpj(cnpj);
		this.setListaDepartamento(new ArrayList<Departamento>());
	}
	
	public Empresa() {
	}

	public String getNomeEmp() {
		return nomeEmp;
	}

	public void setNomeEmp(String nomeEmp) {
		this.nomeEmp = nomeEmp;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public ArrayList<Departamento> getListaDepartamento() {
		return listaDepartamento;
	}

	public void setListaDepartamento(ArrayList<Departamento> listaDepartamento) {
		this.listaDepartamento = listaDepartamento;
	}
	
	public void addDepartamento(Departamento departamento) {
		this.listaDepartamento.add(departamento);
	}
	
	public void imprimirDepartamento() {
		for (int i=0; i<this.listaDepartamento.size();i++) {
			System.out.println ("Nome da empresa : " + this.listaDepartamento.get(i).getNomeDpto());
		}
	}
	
	public void transfFuncionario (Funcionario funcionario, Departamento departamento) {
		funcionario.getDepartamento().removerFuncionario(funcionario);
		departamento.addFuncionario(funcionario);
		funcionario.setDepartamento(departamento);
	}

}
