package aula02;
import java.util.Scanner;

public class EstruturaCondEncadeada {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);

		System.out.println("Informe a média final do aluno: ");
		double mediaFinal = entradaTeclado.nextDouble();

		if(mediaFinal >= 6.0){
		    System.out.println("Aluno aprovado.");
		} else if(mediaFinal >= 4.0){
		    System.out.println("Aluno de recuperação.");
		} else{
		    System.out.println("Aluno reprovado.");
		}
	}
}
