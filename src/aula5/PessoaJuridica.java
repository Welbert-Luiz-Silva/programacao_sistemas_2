package aula5;

public class PessoaJuridica extends Pessoa{
	
	//Atributos
	private String cnpj;
	private String ie;

	//Métodos
	public PessoaJuridica(String none, String endereco, String cnpj, String ie) {
		super(none, endereco);
		this.cnpj = cnpj;
		this.ie = ie;	
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	@Override
	public void mostraDetalhes() {
		System.out.println("PESSOA JURIDICA");
		System.out.println("Nome: " + getNone());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("CNPJ : " + getCnpj());
		System.out.println("Inscrição Estadual: " + getIe());
		System.out.println("-----------------------------------");
		
	}

	@Override
	public String toString() {
		return "PessoaJuridica [None= " + getNone() + ", Endereco= " + getEndereco() + ", cnpj= " + cnpj
				+ ", ie= " + ie + "]";
	}
	
	
	
	
	
	

}
