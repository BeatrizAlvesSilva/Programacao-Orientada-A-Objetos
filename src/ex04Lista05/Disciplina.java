package ex04Lista05;

import java.util.ArrayList;
import java.util.List;

// classe que representa uma disciplina, contendo uma lista de alunos matriculados
public class Disciplina {
	private String nomeDisciplina;
	private List<Aluno> alunos; // lista de alunos matriculados
	
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.alunos = new ArrayList<Aluno>();
	}
	
	// matricula um novo aluno verificando se o RA já está cadastrado
	public void matricularAluno(String nomeAluno, int RA) {
		System.out.println("#### Matricular Aluno ####\n");
		for(Aluno aluno: alunos) {
			// verifica se o RA já está cadastrado
			if(RA == aluno.getRA()) {
				System.out.println("RA já está cadastrado, tente novamente.\n");
				System.out.println("--------------------------------\n");
				return; // sai do método sem adicionar o aluno 
			}
		}
		Aluno al = new Aluno(nomeAluno, RA);
		this.alunos.add(al);
		System.out.println("Aluno cadastrado com sucesso.\n");
		System.out.println("--------------------------------\n");
		
	}
	
	// lança uma nota no RA informado
	public void lancarNota(int RA, float nota) {
		boolean encontrado = false; // flag pra verificar se o aluno foi encontrado
		
		for(Aluno aluno: alunos) {
			if(RA == aluno.getRA()) {
				encontrado = true; // encontrado
				aluno.adicionarNota(nota);
			}
		}
		// exibe erro caso o aluno não seja encontrado
		if(!encontrado) {
			System.out.println("Aluno não encontrado, tente novamente.\n");
			System.out.println("--------------------------------\n");
		}
	}
	
	// exibe todas as notas cadastradas no RA infomado
	public void verBoletim(int RA) {
		boolean encontrado = false; // flag pra verificar se o aluno foi encontrado
		System.out.println("###### Boletim ######\n");
		for(Aluno aluno: alunos) {
			if(RA == aluno.getRA()) {
				encontrado = true; // encontrado 
				System.out.println("Aluno: " + aluno.getNomeAluno());
				aluno.verNotas();
				System.out.println("--------------------------------\n");
			}
		}
		
		// exibe erro caso o aluno não seja encontrado
		if(!encontrado) {
			System.out.println("Aluno não encontrado, tente novamente.\n");
			System.out.println("--------------------------------\n");
		}
	}
	
	// exibe a média de todos os alunos e se foram aprovados/reprovados
	public void finalizarSemestre() {
		System.out.println("### Relatório final de " + nomeDisciplina + " ###\n");
		for(Aluno aluno: alunos) {
				float media = aluno.gerarMedia();				
				if(media >= 7) {
					System.out.println("Aluno: " + aluno.getNomeAluno() + " | Media: " + media + " | Aluno APROVADO por nota.\n");
				} else {
					System.out.println("Aluno: " + aluno.getNomeAluno() + " | Media: " + media + " | Aluno REPROVADO por nota.\n");
				}
		}
	}
}
