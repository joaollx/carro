package tarefa;

public class Main {

	public static void main(String[] args) {
	
	Carro carro1 = new Carro(1, "gol", "vermelho", 4, 4);
	Carro carro2 = new Carro(2, "uno", "branco", 4, 4);

	System.out.println("a cor antes era " + carro1.getCor() + "." );
	
	Carro.setCor("preto");
	
	
	System.out.println("a cor agora é " + carro1.getCor() + "." );
	
	
	
	}
}
