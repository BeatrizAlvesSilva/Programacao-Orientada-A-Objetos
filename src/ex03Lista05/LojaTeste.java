package ex03Lista05;

public class LojaTeste {
	public static void main(String[] args) {
		Loja loja1 = new Loja(12345, "Loja 1");
		
		loja1.cadastrarProduto(111, "Notebook", "Acer", "Nitro", 3299, 7);
		loja1.cadastrarProduto(111, "Notebook", "Acer", "Nitro", 3299, 4);
		
		loja1.cadastrarProduto(222, "Celular", "iPhone", "15 PRO", 7899, 12);
		
		loja1.cadastrarProduto(333, "Celular", "Samsung", "A34", 1599, 5);

		loja1.imprimirRelatorio();
		
		loja1.reporEstoque(111, 5);
		
		loja1.imprimirRelatorio();
		
		loja1.venderProduto(111, 16);
		
		loja1.imprimirRelatorio();
		
		loja1.reporEstoque(111, 7);
		
		loja1.imprimirRelatorio();
	}
}
