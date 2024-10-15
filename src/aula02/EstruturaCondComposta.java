package aula02;
import java.util.Scanner;

public class EstruturaCondComposta {
	public static void main(String[] args) {
	Scanner entradaTeclado = new Scanner(System.in);

	System.out.println("Informe um valor inteiro: ");
	int valor = entradaTeclado.nextInt();

	if(valor % 2 == 0){
	    System.out.println("Número par");
	} else{
	    System.out.println("Número ímpar");
	}
	}
}
