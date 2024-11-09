package aula5.CRUD;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String numeroRegistro;

    public PessoaJuridica(int id, String nome, String endereco, String cnpj, String numeroRegistro) {
        super(id, nome, endereco);
        this.cnpj = cnpj;
        this.numeroRegistro = numeroRegistro;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }
}