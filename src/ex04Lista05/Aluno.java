package ex04Lista05;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nomeAluno;
	private int RA;
	private List<Nota> notas;
	
	public Aluno(String nomeAluno, int RA) {
		this.nomeAluno = nomeAluno;
		this.RA = RA;
		this.notas = new ArrayList<Nota>();
	}
	
	public void adicionarNota(float nota) {
		Nota nt = new Nota(nota);
		this.notas.add(nt);
	}
	
	public void verNotas() {
		for(Nota nota: notas) {
			System.out.println("Nota: " + nota.getNota());
		}
	}
	
	public float gerarMedia() {
		float media = 0, qtde = 0;
		for(Nota nota: notas) {
			media = media + nota.getNota();
			qtde = qtde + 1;
		}
		
		media = media / qtde;
		
		return media;
	}

	public int getRA() {
		return RA;
	}	
	
	public String getNomeAluno() {
		return nomeAluno;
	}
}
