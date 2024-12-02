package ex03Lista05;

// classse que representa um produto
public class Produto {
	private int codigo;
	private String nomeProduto;
	private String marca;
	private String modelo;
	private int qtdeEstoque;
	private float valorVenda;
	
	public Produto(int codigo, String nomeProduto, String marca, String modelo, float valorVenda, int qtdeEstoque) {
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
		this.modelo = modelo;
		this.qtdeEstoque = qtdeEstoque;
		this.valorVenda = valorVenda;
	}

	public void imprimir() {

		System.out.println(String.format("%-10d %-15s %-15s %-10d %-10.2f", codigo, nomeProduto, modelo, qtdeEstoque, valorVenda));
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setQtdeEstoque(int qtde) {
		this.qtdeEstoque = qtde;
	}
	
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
}
