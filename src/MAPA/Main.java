package MAPA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	// MÉTODOS E VARIÁVEIS ACESSÍVEIS GLOBALEMNTE
    private static List<Cliente> listaClientes = new ArrayList<>();
    private static int idCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        //ESPECIFICAÇÃO DAS OPÇÕES DE SELEÇÃO
        do {
            System.out.println("\nMenu de Operações:");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Atualizar Cliente");
            System.out.println("4 - Remover Cliente");
            System.out.println("5 - Buscar Cliente");
            System.out.println("6 - Sair");
            System.out.print("Escolha a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            // MENU DE OPÇÕES
            switch (opcao) {
                case 1:
                    cadastrarCliente(scanner);
                    break;
                case 2:
                    listarClientes();
                    break;
                case 3:
                    atualizarCliente(scanner);
                    break;
                case 4:
                    removerCliente(scanner);
                    break;
                case 5:
                    buscarCliente(scanner);
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }

    // Cadastrar um novo cliente
    public static void cadastrarCliente(Scanner scanner) {
        System.out.println("\nCadastro de Cliente:");

        // Coleta os dados do cliente
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o e-mail: ");
        String email = scanner.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();

        // Cria e adiciona o cliente na lista
        Cliente cliente = new Cliente(idCounter++, nome, email, telefone);
        listaClientes.add(cliente);

        System.out.println("Cliente cadastrado com sucesso!");
    }

    // Listar todos os clientes cadastrados
    public static void listarClientes() {
        System.out.println("\nLista de Clientes Cadastrados:");
        if (listaClientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : listaClientes) {
                System.out.println(cliente);
            }
        }
    }

    // Atualizar os dados de um cliente pelo ID
    public static void atualizarCliente(Scanner scanner) {
        System.out.print("\nDigite o ID do cliente a ser atualizado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir o '\n'

        // Busca o cliente pelo ID
        Cliente cliente = buscarClientePorId(id);
        if (cliente != null) {
            System.out.print("Digite o novo nome (atual: " + cliente.getNome() + "): ");
            cliente.setNome(scanner.nextLine());
            System.out.print("Digite o novo e-mail (atual: " + cliente.getEmail() + "): ");
            cliente.setEmail(scanner.nextLine());
            System.out.print("Digite o novo telefone (atual: " + cliente.getTelefone() + "): ");
            cliente.setTelefone(scanner.nextLine());

            System.out.println("Cliente atualizado com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    // Remover um cliente pelo ID
    public static void removerCliente(Scanner scanner) {
        System.out.print("\nDigite o ID do cliente a ser removido: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir o '\n'

        Cliente cliente = buscarClientePorId(id);
        if (cliente != null) {
            listaClientes.remove(cliente);
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    // Buscar um cliente pelo ID
    public static void buscarCliente(Scanner scanner) {
        System.out.print("\nDigite o ID do cliente a ser buscado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir o '\n'

        Cliente cliente = buscarClientePorId(id);
        if (cliente != null) {
            System.out.println("Cliente encontrado: " + cliente);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    // Método auxiliar para buscar cliente pelo ID
    public static Cliente buscarClientePorId(int id) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }
}