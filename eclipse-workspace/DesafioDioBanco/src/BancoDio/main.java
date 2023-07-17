package BancoDio;

public class main {

	public static void main(String[] args) {
		
	Cliente jean = new Cliente();
	jean.setNome("Jean");
		
	Conta contaCorrente = new ContaCorrente(jean);
	Conta contaPoupanca = new ContaPoupança(jean);
	
	contaCorrente.imprimirExtrato();
	contaPoupanca.imprimirExtrato();
	}
}
