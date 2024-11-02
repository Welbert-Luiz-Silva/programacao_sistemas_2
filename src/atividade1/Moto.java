package atividade1;

public class Moto extends Veiculo{
	private boolean temSidecar;
	
	//Construtor
	public Moto(String marca, String modelo, int ano, boolean temSidecar) {
		super(marca, modelo, ano);
		this.temSidecar = temSidecar;
	}

	
	//Getters and Setters
	public boolean isTemSidecar() {
		return temSidecar;
	}

	public void setTemSidecar(boolean temSidecar) {
		this.temSidecar = temSidecar;
	}
	
	//Método Exibir Detalhas
	@Override
	public void exibirDetalhes() {
		// TODO Auto-generated method stub
		System.out.println("=== MOTO ===");
		System.out.println("Marca: " +getMarca());
		System.out.println("Modelo: " +getModelo());
		System.out.println("Ano: " +getAno());
		System.out.println("Tem Sidecar: " + (isTemSidecar() ? "Sim" : "Não"));
		System.out.println("----------------------------------------");		
		
	}	

}
