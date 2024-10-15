package aula2;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Olá Mundo!");
		
		//Criando a variável de instância do objeto
		Cliente cliente1;
		
		//Instanciando o objeto
		cliente1 = new Cliente(1, "sososos", "DOdodod", "31");
		
		Cliente	cliente2 = new Cliente(2, "Beto", "wel@Gma", "311");
		
		System.out.println(cliente1.toString());
		
		System.out.println(cliente2.toString());
		
	}

}
