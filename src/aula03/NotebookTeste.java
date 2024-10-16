package aula03;

public class NotebookTeste {
	public static void main(String[] args) {
		Notebook note1 = new Notebook();
		note1.marca = "Vaio";
		note1.modelo = "FE15";
		note1.polegadasTela = 17;
		note1.modeloProcessador = "AMD Ryzen 5 5500U";
		note1.qtdeRam = 8;
		note1.qtdeArmazenamento = 500;
		
		System.out.println("Marca: " + note1.marca);
		System.out.println("Modelo: " + note1.modelo);
		System.out.println("Polegadas da tela: " + note1.polegadasTela + "'");
		System.out.println("Modelo do processador: " + note1.modeloProcessador);
		System.out.println("Quantidade de memória ram: " + note1.qtdeRam + " GB");
		System.out.println("Capacidade de armazenamento: " + note1.qtdeArmazenamento + " GB");
		
	}
}
