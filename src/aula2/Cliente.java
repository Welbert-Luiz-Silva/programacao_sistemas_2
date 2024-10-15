package aula2;

//Atributos da Classe
public class Cliente {
	private int id;
	private String nome;
	private String email;
	private String telefone;
	
	
	//Métodos
	
	// Método Construtor
	public Cliente(int id, String nome, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	// Construtor Padrão
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Métodos Getteers e Setters	
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	//Sobrepossição de método
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cliente [ID= " + id + ", NOME= " + nome + ", EMAIL= " + email + ", TELEFONE= " + telefone + "]";
	}
	
	

	
}
