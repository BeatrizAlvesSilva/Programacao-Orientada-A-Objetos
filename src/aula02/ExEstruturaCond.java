package aula02;
import java.util.Scanner;

public class ExEstruturaCond {
	public static void main(String[] args) {
	Scanner entradaTeclado = new Scanner(System.in);
	
	System.out.println("Informe um número: ");
	int num1 = entradaTeclado.nextInt();
	System.out.println("Informe um número: ");
	int num2 = entradaTeclado.nextInt();
	System.out.println("Informe um número: ");
	int num3 = entradaTeclado.nextInt();
	
	int maior;
	
	if(num1 >= num2) {
		maior = num1;
	} else {
		maior = num2;
	}
	
	if(num3 >= maior) {
		maior = num3;
	}
	
	System.out.println();
	System.out.println("Maior número: " + maior);
}
}