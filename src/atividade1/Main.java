package atividade1;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro carro1 = new Carro("VW", "FOX", 2002, 4);
		Carro carro2 = new Carro("FIAT", "PALIO", 2004, 5);
		Moto moto1 = new Moto("HONDA", "CG-125", 2000, true);
		Moto moto2 = new Moto("YAMAHA", "FAZER-250", 2020, false);
		
		
		// Exibir detalhes sem utilizar ArrayList
//		carro1.exibirDetalhes();
//		carro2.exibirDetalhes();
//		moto1.exibirDetalhes();
//		moto2.exibirDetalhes();
		
		// Exibir detalhes com ArrayList		
		ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
		listaVeiculos.add(carro1);
		listaVeiculos.add(carro2);
		listaVeiculos.add(moto1);
		listaVeiculos.add(moto2);
		
        // Cabeçalho
		System.out.println("--------- ATIVIDADE 1 --------------");
        System.out.println("Desenvolvida por Welbert Luiz Silva");
        System.out.println("RA: 24513802-5");
		System.out.println("-----------------------------------");
        
        // Dados dos veículos       		
		for (Veiculo veiculo : listaVeiculos) {
			veiculo.exibirDetalhes();
		}
										

	}

}
