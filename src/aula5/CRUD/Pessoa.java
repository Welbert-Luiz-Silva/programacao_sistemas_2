package aula5.CRUD;


public abstract class Pessoa {
    private int id;
    protected String nome;
    protected String endereco;

    public Pessoa(int id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}