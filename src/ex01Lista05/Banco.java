package ex01Lista05;

import java.util.ArrayList;
import java.util.List;
	
public class Banco {
	private List<Conta> contas;
	
	public Banco() {
		this.contas = new ArrayList<Conta>();
	}
	
	public void criarConta(int numeroConta, String nomeUsuario, int cpf) {
		Conta cb = new Conta(numeroConta, nomeUsuario, cpf);
		this.contas.add(cb);
		System.out.println("\nConta criada com sucesso.");
	}
	
	public void sacar(int numeroConta, float valor) {
		for(Conta conta: contas) {
			if(numeroConta == conta.getNumeroConta()) {
				if(conta.getSaldo() >= valor) {
					conta.setSaldo(conta.getSaldo() - valor);
					System.out.println("\nValor sacado: R$" + valor);
				}
			}
		}
	}
	
	public void depositar(int numeroConta, float valor) {
		for(Conta conta: contas) {
			if(numeroConta == conta.getNumeroConta()) {
				conta.setSaldo(valor);
			}
		}
	}
	
	public void verificarSaldo(int numeroConta) {
		for(Conta conta: contas) {
			if(numeroConta == conta.getNumeroConta()) {
				System.out.println("\nNúmero da conta: " + conta.getNumeroConta());
				System.out.println("Nome de usuário: " + conta.getNomeUsuario());
				System.out.println("CPF: " + conta.getCpf());
				System.out.println("Saldo em conta: R$" + conta.getSaldo());
			}
		}
	}
}

