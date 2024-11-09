package aula5.CRUD;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> listaPessoas = new ArrayList<>();
        int idCounter = 1;  // Variável para gerar IDs únicas para cada pessoa

        // Loop para inserir dados
        while (true) {
            System.out.println("\nDeseja cadastrar uma pessoa? (Clique Enter para continuar ou 'sair' para finalizar): ");
            String opcao = scanner.nextLine().toLowerCase();

            if (opcao.equals("sair")) {
                break;  // Sai do laço se o usuário digitar "sair"
            }

            // Pergunta o tipo da pessoa (1 para Física, 2 para Jurídica)
            System.out.print("Digite o tipo da pessoa (1 para Física, 2 para Jurídica): ");
            int tipoPessoa = scanner.nextInt();
            scanner.nextLine();  // Consumir a linha em branco após o nextInt()

            // Coletando dados comuns
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o endereço: ");
            String endereco = scanner.nextLine();

            if (tipoPessoa == 1) {  // Pessoa Física
                System.out.print("Digite o CPF: ");
                String cpf = scanner.nextLine();
                System.out.print("Digite o estado civil: ");
                String estadoCivil = scanner.nextLine();

                // Criando e adicionando a PessoaFisica à lista
                PessoaFisica pessoaFisica = new PessoaFisica(idCounter++, nome, endereco, cpf, estadoCivil);
                listaPessoas.add(pessoaFisica);

            } else if (tipoPessoa == 2) {  // Pessoa Jurídica
                System.out.print("Digite o CNPJ: ");
                String cnpj = scanner.nextLine();
                System.out.print("Digite o número de registro: ");
                String numeroRegistro = scanner.nextLine();

                // Criando e adicionando a PessoaJuridica à lista
                PessoaJuridica pessoaJuridica = new PessoaJuridica(idCounter++, nome, endereco, cnpj, numeroRegistro);
                listaPessoas.add(pessoaJuridica);

            } else {
                System.out.println("Tipo de pessoa inválido! Tente novamente.");
            }
        }

        // Exibindo as informações cadastradas
        System.out.println("\nCadastro concluído!");
        System.out.println("Total de pessoas cadastradas: " + listaPessoas.size());

        // Exibindo os dados das pessoas cadastradas
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) pessoa;
                System.out.println("***** Pessoa Física *****");
                System.out.println("ID: " + pf.getId() + " | " + pf.getNome() + " (" + pf.getCpf() + ") - " + pf.getEstadoCivil());
            } else if (pessoa instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) pessoa;
                System.out.println("***** Pessoa Jurídica *****");
                System.out.println("ID: " + pj.getId() + " | " + pj.getNome() + " (" + pj.getCnpj() + ") - Registro: " + pj.getNumeroRegistro());
            }
        }

        // Fechando o scanner
        scanner.close();
    }
}