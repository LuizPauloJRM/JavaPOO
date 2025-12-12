package IntroducaoPOO;

public class Main {

	// construtor -> Método especial de uma class , sempre que um objeto for criado

	public static void main(String[] args) {
		// CLASSE :Modelo que define a estrutura , os atributos , variaveis metodos 
		Carro carro1 = new Carro("Passat");//criando novo objeto desse tipo carro 
		Carro carro2= new  Carro("Palio");
		carro1.acelerar();
		carro2.acelerar();
		
		
	}

}

//Criando um tipo 
//metodo construtor : Serve para quando tiver construindo um objeto consiga passr parametros , atribuir valores para atributos deste objeto 
//
class Carro {
	// Atributos : Variaveis pertencem a carro
	// Modelo vai ser definido no momento que for criado
	String modelo;
	String cor;

	// Passar parametros para construcao deste modelo
	//
	public Carro(String modelo) {
		// this para acessar a instancia deste carro , this modelo vai receber oque eu
		// passar em parametro
//		System.out.println("Carro criado");
		this.modelo = modelo;
	}

	// Métodos
//	public String getModelo() {
//		return modelo;
//	}
	
	public void acelerar() {
		System.out.println("Acelerando o carro " + modelo);
	}
}