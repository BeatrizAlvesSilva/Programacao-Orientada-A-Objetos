package ex01Lista05;

public class Conta {
	private int numeroConta;
	private float saldo;
	private String nomeUsuario;
	private int cpf;
	

	public Conta(int numeroConta, String nomeUsuario, int cpf) {
		this.numeroConta = numeroConta;
		this.nomeUsuario = nomeUsuario;
		this.cpf = cpf;
		this.setSaldo(0);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public int getCpf() {
		return cpf;
	}
}
