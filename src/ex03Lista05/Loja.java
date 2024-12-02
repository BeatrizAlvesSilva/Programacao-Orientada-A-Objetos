package ex03Lista05;

import java.util.ArrayList;
import java.util.List;

// classe que representa uma loja, possuindo cnpj, razao social e uma lista com produtos
public class Loja {
	private int cnpj;
	private String razaoSocial;
	private List<Produto> produtos;
	
	public Loja(int cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.produtos = new ArrayList<Produto>();
	}
	
	public void cadastrarProduto(int codigo, String nomeProduto, String marca, String modelo, float valorVenda, int qtdeEstoque) {
		boolean aux = verificarEstoque(codigo, qtdeEstoque);
		
		if(aux) {
			return;
		} else {
			Produto pd = new Produto(codigo, nomeProduto, marca, modelo, valorVenda, qtdeEstoque);
			this.produtos.add(pd);
			System.out.println("Produto criado.\n");
		}
	}
	
	public void reporEstoque(int codigo, int qtde) {
		boolean aux = verificarEstoque(codigo, qtde);
		if(!aux) {
			System.out.println("Produto não cadastrado, tente novamente.\n");
		}
	}
	
	public boolean verificarEstoque(int codigo, int qtdeEstoque) {
		boolean existencia = false;
		for(Produto produto : produtos) {
			if(codigo == produto.getCodigo()) {
				existencia = true;
				produto.setQtdeEstoque(produto.getQtdeEstoque() + qtdeEstoque);
				System.out.println("Quantidade em estoque alterada.\n");
			}
		}
		return existencia;
	}
	
	public void imprimirRelatorio() {
		//System.out.println("#### Relatório ####");
		
		System.out.println("==============================================================");
		System.out.println(String.format("%-10s %-15s %-15s %-10s %-10s", "Código", "Nome", "Modelo", "Estoque", "Valor"));
		System.out.println("==============================================================");
		for(Produto produto : produtos) {
			produto.imprimir();
		}
		System.out.println("--------------------------------------------------------------\n");
	}
	
	public void venderProduto(int codigo, int qtde) {
		for(Produto produto : produtos) {
			if(codigo == produto.getCodigo()) {
				if(qtde <= produto.getQtdeEstoque()) {
					produto.setQtdeEstoque(produto.getQtdeEstoque() - qtde);
					System.out.println("Venda realizada com sucesso.\n");
				} else {
					System.out.println("Estoque insuficiente\n");
				}
			}
		}
	}
}
