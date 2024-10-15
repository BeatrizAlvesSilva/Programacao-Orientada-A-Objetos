package aula02;
import java.util.Scanner;

public class EstruturaCondSimples {
	public static void main(String[] args) {
	Scanner entradaTeclado = new Scanner(System.in);
	
	System.out.println("Informe sua idade: ");
	int idade = entradaTeclado.nextInt();
	
	if(idade >= 16) {
		System.out.println("Voto permitido!");
	}
	}
}
