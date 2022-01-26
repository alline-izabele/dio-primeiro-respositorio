package desafio.dio2;

public class Conta implements IConta{
	
	private final static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	public Conta() {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	public void depositar(double valor);
	public void transferir(double valor, Conta contaDestino);

	public void sacar(double valor) {
		saldo -= valor;
	}
	public void depositar(double valor) {
		saldo += valor;
	}
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

}
