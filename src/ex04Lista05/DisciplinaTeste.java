package ex04Lista05;

public class DisciplinaTeste {
	public static void main(String[] args) {
		// criando uma disciplina
		Disciplina d1 = new Disciplina("Matematica");
		
		// matriculando alunos na disciplina
		d1.matricularAluno("João da Silva", 12345);
		d1.matricularAluno("Maria Oliveira", 23456);
		d1.matricularAluno("Gabriel Souza", 34567);
	
		// tentando matricular um aluno com um RA já cadastrado
		d1.matricularAluno("Julia Aparecida", 12345);
	
		// lançando notas dos alunos
		d1.lancarNota(12345, 7);
		d1.lancarNota(12345, 1);
		d1.lancarNota(12345, 2);
		d1.lancarNota(12345, 3);
	
		d1.lancarNota(23456, 7);
		d1.lancarNota(23456, 8);
		d1.lancarNota(23456, 9);
		d1.lancarNota(23456, 10);
	
		d1.lancarNota(34567, 4);
		d1.lancarNota(34567, 8);
		d1.lancarNota(34567, 1);
		d1.lancarNota(34567, 5);
	
		d1.verBoletim(34567);
	
		// tentando visualizar um boletim de RA que não existe
		d1.verBoletim(33333);
	
		d1.finalizarSemestre();
	}
}
