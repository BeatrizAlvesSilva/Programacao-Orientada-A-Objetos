package aula02;

import java.util.Scanner;

public class ProblemaScanner {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Informe o logradouro: ");
		String logradouro = entradaTeclado.nextLine();
		System.out.println("Informe o número da residência: ");
		int numero = entradaTeclado.nextInt();
		System.out.println("Informe o bairro: ");
		entradaTeclado.nextLine(); // limpeza de buffer
		String bairro = entradaTeclado.nextLine();
		System.out.println("Informe o telefone: ");
		int telefone = entradaTeclado.nextInt();
		System.out.println("---------------------------------");
		
		System.out.println("Logradouro: " + logradouro);
		System.out.println("Número: " + numero);
		System.out.println("Bairro: " + bairro);
		System.out.println("Telefone: " + telefone);
	}
}
