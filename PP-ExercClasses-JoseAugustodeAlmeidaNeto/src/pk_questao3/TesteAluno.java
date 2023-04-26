package pk_questao3;

public class TesteAluno {
	public static void main(String[] args) {
        Aluno jadan = new Aluno("Jose Augusto de Almeida Neto", "Adrianopolis", "987.786.276-97", "(92)98787-9872", "27/02/2002", "Aristoteles Almeida", "Ysadhora Almeida");
        System.out.println("Nome do aluno: " +jadan.getNome());
        System.out.println("Endereco do aluno: " +jadan.getEndereco());
        System.out.println("CPF do aluno: " +jadan.getCPF());
        System.out.println("Telefone do aluno: " +jadan.getFone());
        System.out.println("Data de nascimento do aluno: " +jadan.getDate());
        System.out.println("Nome do pai do aluno: " +jadan.getNomePai());
        System.out.println("Nome da mae do aluno: " +jadan.getNomeMae());
        
        jadan.setAlterarFone("(92)98887-5627");
        jadan.setAlterarPai("John Lennon");
        jadan.setAlterarMae("Alicia Keys");
        jadan.setAlterarEndereco("Parque 10");
 
        System.out.println("Nome do aluno: " +jadan.getNome());
        System.out.println("Endereco do aluno: " +jadan.getEndereco());
        System.out.println("CPF do aluno: " +jadan.getCPF());
        System.out.println("Telefone do aluno: " +jadan.getFone());
        System.out.println("Data de nascimento do aluno: " +jadan.getDate());
        System.out.println("Nome do pai do aluno: " +jadan.getNomePai());
        System.out.println("Nome da mae do aluno: " +jadan.getNomeMae());
    }
}
