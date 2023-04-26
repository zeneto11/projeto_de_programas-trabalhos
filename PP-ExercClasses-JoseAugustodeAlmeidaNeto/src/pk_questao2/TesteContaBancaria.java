package pk_questao2;

public class TesteContaBancaria {
	public static void main(String[] args) {
        ContaBancaria Nubank = new ContaBancaria(997.50, "27/02/2002", "Corrente", 7.80);
        System.out.println("Data de abertura da Conta: " +Nubank.getDataAberturaFormatada());
        System.out.println("Saldo da Conta: " +Nubank.getSaldo());
        System.out.println("Tipo da Conta: " +Nubank.getTipoConta());
        System.out.println("Valor de manutencao da Conta: " +Nubank.getValorManutencao());
        Nubank.setDepositar(56.50);
        System.out.println("Saldo da Conta: " +Nubank.getSaldo());
        Nubank.setSacar(250.75);
        System.out.println("Saldo da Conta: " +Nubank.getSaldo());
    }
}
