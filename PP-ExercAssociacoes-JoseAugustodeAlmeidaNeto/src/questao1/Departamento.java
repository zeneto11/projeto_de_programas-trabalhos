package questao1;

import java.sql.Date;

public class Departamento {
	private String nomeDpto;
    private String localDep;
    private Integer quantidadeProfessores;
    private Date dataCriacaoDepto;
    
    public Departamento (String nomeDpto, String localDep, Integer quantidadeProfessores, Date dataCriacaoDepto){
    	this.setNomeDpto(nomeDpto);
    	this.setLocalDep(localDep);
		this.setQuantidadeProfessores(quantidadeProfessores);
		this.setDataCriacaoDepto(dataCriacaoDepto);
    }
    
    public Departamento() {
    }

	public String getNomeDpto() {
		return nomeDpto;
	}

	public void setNomeDpto(String nomeDpto) {
		this.nomeDpto = nomeDpto;
	}
	
	public String getLocalDep() {
		return localDep;
	}

	public void setLocalDep(String localDep) {
		this.localDep = localDep;
	}

	public Integer getQuantidadeProfessores() {
		return quantidadeProfessores;
	}

	public void setQuantidadeProfessores(Integer quantidadeProfessores) {
		this.quantidadeProfessores = quantidadeProfessores;
	}

	public Date getDataCriacaoDepto() {
		return dataCriacaoDepto;
	}

	public void setDataCriacaoDepto(Date dataCriacaoDepto) {
		this.dataCriacaoDepto = dataCriacaoDepto;
	}
	
	public void mostrarDadosDpto() {
		System.out.println ("Nome do departamento: " + this.nomeDpto);
		System.out.println ("Local do departamento: " + this.localDep);
		System.out.println ("Quantidade de professores: " + this.quantidadeProfessores);
		System.out.println ("Data de criação: " + this.dataCriacaoDepto);
	}
	
}
