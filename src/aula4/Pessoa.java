package aula4;

public abstract class Pessoa {
	//Atributos
	private String none;
	private String endereco;
	
	//Métodos
	public Pessoa(String none, String endereco) {
		this.none = none;
		this.endereco = endereco;
	}

	public String getNone() {
		return none;
	}

	public void setNone(String none) {
		this.none = none;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public abstract void mostraDetalhes();
	
		

}
