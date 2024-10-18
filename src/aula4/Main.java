package aula4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PessoaFisica pf1 = new PessoaFisica("Welbert", "Rua A", "7856496615", "Casado");
		PessoaJuridica pj1 = new PessoaJuridica("WLS", "Rua WLSS", "010111/0001-01", "855493615");

		// pf1.mostraDetalhes();
		// pj1.mostraDetalhes();

		ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		listaPessoas.add(pj1);
		listaPessoas.add(pf1);

		for (Pessoa pessoa : listaPessoas) {
			pessoa.mostraDetalhes();
		}

	}

}
