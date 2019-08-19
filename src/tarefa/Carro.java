package tarefa;

public class Carro {
	
	private Integer id;
	private String Modelo;
	private static String Cor;
	private Integer N_rodas;
	private Integer N_portas;	
	
	private Boolean TrocarCorPintura;
	

	// método constructor vazio
	// os metodos construtores tem o mesmo nome da classe
	// os metodos construtores servem para iniciar atributods e 
	// executar açoes iniciais do objeto
	public Carro() {
		super();
	}
	
	
	// constructor com parametros
	public Carro(Integer id, String modelo, String cor, Integer n_rodas, Integer n_portas) {
		super();
		this.id = id;
		this.Modelo = modelo;
		Cor = cor;
		this.N_rodas = n_rodas;
		this.N_portas = n_portas;
	}

	public Integer getId() {
		return id;
	}
	
	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getCor() {
		return Cor;
	}

	public static void setCor(String cor) {
		Cor = cor;
	}

	public Integer getN_rodas() {
		return N_rodas;
	}

	public void setN_rodas(Integer n_rodas) {
		N_rodas = n_rodas;
	}

	public Integer getN_portas() {
		return N_portas;
	}

	public void setN_portas(Integer n_portas) {
		N_portas = n_portas;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Boolean getTrocarCorPintura() {
		return TrocarCorPintura;
	}
	
	public void getTrocarCorPintura(Boolean TrocarCorPintura) {
		this.TrocarCorPintura = TrocarCorPintura ;
	}

}
