package ex01Lista05;

public class BancoTeste {
public static void main(String[] args) {
	Banco banco1 = new Banco();
	
	banco1.criarConta(123, "Beatriz Alves", 465491);
	
	banco1.verificarSaldo(123);
	
	banco1.depositar(123, 134);
	
	banco1.verificarSaldo(123);
	
	banco1.sacar(123, 150);
	
	banco1.verificarSaldo(123);
	
	banco1.sacar(123, 99);
	
	banco1.verificarSaldo(123);
}
}
