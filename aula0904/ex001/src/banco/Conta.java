package banco;

public class Conta {
	protected String numeroConta;
	protected String nome;
	protected double saldo;
	
	public Conta(String conta, String nome, double saldo) {
		this.numeroConta = conta;
		this.nome = nome;
		this.saldo = saldo;
	}
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {

			if(valor <= saldo) {
				this.saldo -= valor;
			}else {
				System.out.println("valor Insuficiente!");
			}
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String toString() {
		return this.numeroConta + " - " 
				+ this.nome + " - "
				+ this.saldo;
	}
	
}
