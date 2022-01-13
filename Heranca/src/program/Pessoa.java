package program;

public class Pessoa {

	private Integer idade;
	private Double peso;
	
	public Pessoa() {
	}
	
	public Pessoa(final Integer idade) {
		this.idade = idade;
	}

	public Pessoa(final Integer idade, final Double peso) {
		this.idade = idade;
		this.peso = peso;
	}

	public Integer getIdade() {
		return idade;
	}

	public Double getPeso() {
		return peso;
	}
	
	protected String relatrio() {
		return "Idade : $idade e Peso : $peso"; 
	}
	
}
