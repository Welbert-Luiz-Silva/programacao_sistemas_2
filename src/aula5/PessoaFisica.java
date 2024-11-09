package aula5;

public class PessoaFisica extends Pessoa {

	// Atributos
	private String cpf;
	private String estadoCivil;

	// Métodos
	public PessoaFisica(String none, String endereco, String cpf, String estadoCivil) {
		super(none, endereco);
		this.cpf = cpf;
		this.estadoCivil = estadoCivil;		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public void mostraDetalhes() {
		System.out.println("PESSOA FÍSICA");
		System.out.println("Nome: " + getNone());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("cpf: " + getCpf());
		System.out.println("Estado Civil: " + getEstadoCivil());
		System.out.println("-----------------------------------");
		
		
	}
	//Imprimindo com ToString
	@Override
	public String toString() {
		return "PessoaFisica [None= " + getNone() + ", Endereco " + getEndereco() + ", cpf= " + cpf
				+ ", estadoCivil= " + estadoCivil + "]";
	}
	

	
	
	

}
