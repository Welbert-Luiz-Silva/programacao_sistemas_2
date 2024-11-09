package aula5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PessoaFisica pf1 = new PessoaFisica("Marcelo Souza da Silva","Rua sem saida, 15", "6565651414", "Casado");	
		PessoaJuridica pj1 = new PessoaJuridica("Subway", "Rua central, 100", "333654321/0001-01", "987654");
		PessoaJuridica pj2 = new PessoaJuridica("Coca-cola", "Rua das Oliveiras, 300", "222456789/0001-01", "123456");
		PessoaJuridica pj3 = new PessoaJuridica("MacDonalds", "Rua central, 100", "111321654/0001-01", "987321");
		PessoaFisica pf2 = new PessoaFisica("Maria da Silva", "Rua sem saida, 15", "6565651414", "Casada");

		List<Pessoa> listaPessoas = new ArrayList<>();
		listaPessoas.add(pj1);
		listaPessoas.add(pj2);
		listaPessoas.add(pj3);
		listaPessoas.add(pf1);
		listaPessoas.add(pf2);

		// pf1.mostraDetalhes();
		// pj1.mostraDetalhes();

//		ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
//		listaPessoas.add(pj1);
//		listaPessoas.add(pf1);
		
		//Imprimindo com ToString

		System.out.println("Tamanho da Lista: " + listaPessoas.size());

		for (Pessoa pessoa : listaPessoas) {
			if (pessoa instanceof PessoaFisica) {
				System.out.println("***** Pessoa Fisica *****");
				PessoaFisica pf = (PessoaFisica) pessoa;
				System.out.println(pf.getNone() + " (" + pf.getCpf() + ")");
			}
			if (pessoa instanceof PessoaJuridica) {
				System.out.println("***** Pessoa Jurídica *****");
				PessoaJuridica pj = (PessoaJuridica) pessoa;
				System.out.println(pj.getNone() + " (" + pj.getCnpj() + ")");
			}
		}
		
		//Criação de Lista de Strings
		List<String> listaNomes = new ArrayList<>();
		listaNomes.add("Welbert Luiz");
		listaNomes.add("Yale Vieira");
		listaNomes.add("Lucas Eduardo");
		
		System.out.println(listaNomes);
		
		//Ordenação de lista de Strings
		Collections.sort(listaNomes);
		Collections.sort(listaNomes);
		System.out.println(listaNomes);
		
		//Ordenando por Nome
		System.out.println(listaPessoas);
		Collections.sort(listaPessoas);
		System.out.println("Lista Ordenada");
		System.out.println(listaPessoas);
		
		
		
	
		//Criando lista de Pessoa Jurídica	
		List<PessoaJuridica> listaPJ = new ArrayList<>();
		listaPJ.add(pj1);
		listaPJ.add(pj2);
		listaPJ.add(pj3);
		
		System.out.println("Lista de CNPJ");	
		System.out.println(listaPJ);
		//Ordendando a Lista pelo CNPJ
		listaPJ.sort(Comparator.comparing(PessoaJuridica::getCnpj));
		
		System.out.println("Lista Ordenada pelo CNPJ");		
		System.out.println(listaPJ);
		
		
	}

}
