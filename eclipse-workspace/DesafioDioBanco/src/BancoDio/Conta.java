package BancoDio;



public abstract class Conta implements Transacoes {
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Cliente cliente;
	
	

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	public int getAgencia() {
		return agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	
	
	@Override
	public void sacar(double valor) {
		saldo -=  valor;
	}
	@Override
	public void depositar(double valor) {
		saldo +=  valor;

	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirExtrato() {
		System.out.println(String.format("Titular da conta: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
