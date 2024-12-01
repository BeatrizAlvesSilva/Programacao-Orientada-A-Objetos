package ex04Lista05;

import java.util.ArrayList;
import java.util.List;

// classe que representa um aluno, contendo informações pessoais e as notas
public class Aluno {
	private String nomeAluno;
	private int RA; 
	private List<Nota> notas; // lista de notas do aluno
	
	public Aluno(String nomeAluno, int RA) {
		this.nomeAluno = nomeAluno;
		this.RA = RA;
		this.notas = new ArrayList<Nota>();
	}
	
	
	// adiciona uma nova nota à lista de notas do aluno
	public void adicionarNota(float nota) {
		Nota nt = new Nota(nota);
		this.notas.add(nt);
	}
	
	// exibe todas as notas cadastradas
	public void verNotas() {
		int i = 1;
		for(Nota nota: notas) {
			System.out.println("Nota " + i++ +": "+ nota.getNota());
		}
	}
	
	// gera a media do semestre com base em todas as notas cadastradas
	public float gerarMedia() {
		if(notas.isEmpty()) {
			return 0; // aluno não tem notas cadastradas
		}
		float soma = 0;
		for(Nota nota : notas) {
			soma += nota.getNota();
		}
		return soma / notas.size(); // média das notas
	}

	public int getRA() {
		return RA;
	}	
	
	public String getNomeAluno() {
		return nomeAluno;
	}
}
