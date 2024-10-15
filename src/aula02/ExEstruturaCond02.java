package aula02;
import java.util.Scanner;

public class ExEstruturaCond02 {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Valor da compra: ");
		float compra = entradaTeclado.nextFloat();
		
		
		float resultado = (compra >= 50) ? 0.1f : 0.05f;
		
		float desconto = compra * resultado;
		float valorFinal = compra - desconto;
		
		System.out.println("Desconto: R$" + desconto);
		System.out.println("Valor final: R$" + valorFinal);
	}
}
