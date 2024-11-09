package MAPA;

public class Cliente {
	
	//ATRIBUTOS
	private int id;
	private String nome;
	private String email;
	private String telefone;
	
	//MÉTODO CONSTRUTOR
	public Cliente(int id, String nome, String email,  String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	//MÉTODOS GETTERS E SETTERS	
	public int getId() {
		return id;
	}

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
	
	//MÉTODO TOSTRING PARA SAIDA
    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", E-mail: " + email + ", Telefone: " + telefone;
    }

	

}
