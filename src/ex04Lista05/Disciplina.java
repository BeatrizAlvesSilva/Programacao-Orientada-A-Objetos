package ex04Lista05;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String nomeDisciplina;
	private List<Aluno> alunos;
	
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.alunos = new ArrayList<Aluno>();
	}
	
	public void matricularAluno(String nomeAluno, int RA) {
		Aluno al = new Aluno(nomeAluno, RA);
		this.alunos.add(al);
	}
	
	public void lancarNota(int RA, float nota) {
		for(Aluno aluno: alunos) {
			if(RA == aluno.getRA()) {
				aluno.adicionarNota(nota);
			}
		}
	}
	
	public void verBoletim(int RA) {
		for(Aluno aluno: alunos) {
			if(RA == aluno.getRA()) {
				System.out.println("Aluno: " + aluno.getNomeAluno());
				aluno.verNotas();
				System.out.println("--------------------------------\n");
			}
		}
	}
	
	public void finalizarSemestre() {
		for(Aluno aluno: alunos) {
				System.out.println("Aluno: " + aluno.getNomeAluno());
				System.out.println("Media: " + aluno.gerarMedia());
				System.out.println("--------------------------------\n");
		}
	}
}
