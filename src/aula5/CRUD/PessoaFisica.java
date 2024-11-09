package aula5.CRUD;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String estadoCivil;

    public PessoaFisica(int id, String nome, String endereco, String cpf, String estadoCivil) {
        super(id, nome, endereco);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
}