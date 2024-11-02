package atividade1;

public class Carro extends Veiculo{
	private int numeroDePortas;
	
	//Construtor
	public Carro(String marca, String modelo, int ano, int numeroDePortas) {
		super(marca, modelo, ano);
		this.numeroDePortas = numeroDePortas;
	}
	
	
	//Métodos Getters and Setters
	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}
	
	//Método Exibir Detalhas
	@Override
	public void exibirDetalhes() {
		// TODO Auto-generated method stub
		System.out.println("=== CARRO ===");
		System.out.println("Marca: " +getMarca());
		System.out.println("Modelo: " +getModelo());
		System.out.println("Ano: " + getAno());
		System.out.println("Numero de Portas: " +getNumeroDePortas());
		System.out.println("----------------------------------------");		
	}
		
}
