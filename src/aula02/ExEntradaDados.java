package aula02;
import java.util.Scanner;

public class ExEntradaDados {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		String nome = entradaTeclado.nextLine();
		
		System.out.println("Informe o sexo: ");
		String sexo = entradaTeclado.nextLine();
		
		System.out.println("Informe o estado civil: ");
		String estadoCivil = entradaTeclado.nextLine();
		
		System.out.println("Informe a quantidade de filhos: ");
		int filhos = entradaTeclado.nextInt();
		entradaTeclado.nextLine(); // limpeza buffer
		
		System.out.println("Informe a escolaridade: ");
		String escolaridade = entradaTeclado.nextLine();
		
		System.out.println("Informe a renda mensal: ");
		float renda = entradaTeclado.nextFloat();
		entradaTeclado.nextLine(); // limpeza buffer
		
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
		System.out.println("Quantidade de filhos: " + filhos);
		System.out.println("Escolaridade: " + escolaridade);
		System.out.println("Renda mensal: " + renda);
	}
}
