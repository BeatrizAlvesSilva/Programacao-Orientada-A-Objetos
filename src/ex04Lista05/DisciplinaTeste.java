package ex04Lista05;

public class DisciplinaTeste {
	public static void main(String[] args) {
	Disciplina d1 = new Disciplina("Matematica");
	
	d1.matricularAluno("Beatriz Alves", 2203014);
	d1.matricularAluno("Anna Eloisa", 1100022);
	d1.matricularAluno("Bruno Henrique", 0011122);
	
	d1.lancarNota(0011122, 7);
	d1.lancarNota(0011122, 1);
	d1.lancarNota(0011122, 2);
	d1.lancarNota(0011122, 3);
	
	d1.lancarNota(1100022, 7);
	d1.lancarNota(1100022, 2);
	d1.lancarNota(1100022, 9);
	d1.lancarNota(1100022, 7);
	
	d1.lancarNota(2203014, 4);
	d1.lancarNota(2203014, 8);
	d1.lancarNota(2203014, 1);
	d1.lancarNota(2203014, 5);
	
	d1.verBoletim(2203014);
	
	d1.finalizarSemestre();
	}
}
