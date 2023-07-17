package BancoDio;

public interface Transacoes {
	 void sacar(double valor);
	 void depositar(double valor);
	 void transferir(double valor,Conta contaDestino);
}
