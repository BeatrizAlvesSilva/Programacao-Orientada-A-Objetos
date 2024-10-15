package aula02;
import java.util.Scanner;

public class OperadorTernario {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Informe um valor inteiro: ");
		int valor = entradaTeclado.nextInt();
		
		String resultado = (valor % 2 == 0) ? "Número par" : "Número ímpar";
		System.out.println(resultado);
	}
}
