package pk_questao3;

public class Aluno {
	private String nome;
    private String endereco;
    private String CPF;
    private String fone;
    private String Date;
    private String nomePai;
    private String nomeMae;
 
    public Aluno(String nome, String endereco, String CPF, String fone,  String Date, String nomePai, String nomeMae){
        this.nome = nome;
        this.endereco = endereco;
        this.CPF = CPF;
        this.fone = fone;
        this.Date = Date;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;   
    }

	public String getNome() {
		return this.nome;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public String getCPF() {
		return this.CPF;
	}

	public String getFone() {
		return this.fone;
	}

	public String getDate() {
		return this.Date;
	}

	public String getNomePai() {
		return this.nomePai;
	}

	public String getNomeMae() {
		return this.nomeMae;
	}
	public void setAlterarFone(String novoFone){
        this.fone = novoFone;
    }
    public void setAlterarPai(String novoPai){
        this.nomePai= novoPai;
    }
    public void setAlterarMae(String novoMae){
        this.nomeMae= novoMae;
    }
    public void setAlterarEndereco(String novoEndereco){
        this.endereco= novoEndereco;
    }
}
