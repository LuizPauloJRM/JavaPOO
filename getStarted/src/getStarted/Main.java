package getStarted;
//Método pricipal 
		//Tudo executavel deve estar dentro desse método 
		//Objeto algo que representa o mundo real 
		//Caneta um objeto que contem seus atributos
		//Caracteristica e estado , comportamentos 
		//Modelo para criar objetos 
		//Caneta : Objeto 
		//Molde : Classe 
		//Classe : Coisas eu tenho , coisas eu faço , como estou 
		//Métodos: Escrever , rabiscar , pintar , tampar , destampar 
		//Atributos : Modelo , cor , ponta , tampada , carga 
		//Estado : 
		//Para criar um objeto tenho que definir uma classe , planejamento 
		//Classe -> Caneta -> Definir atributos caracteristicas  
		//Método rabiscar()
		//Todo método pode receber parametros 
		//Classe Caneta 
		//cor : Caractere 
		//modelo: Caractere 
		//Carga : Inteiro
		//Tampada: Lógico 
		//Atributos metodos e estado 
		//Instanciar c1 = nova Caneta a partir de uma classe 
		//c1.cor="Azul"
		//c1.rabiscar() Método
		//c2 = nova caneta  -> Elas vem da mesma classe o molde 
		//Classe -> Define atributos comuns (protótico)
		//Objeto -> Instancia de uma classe 
		//Abstração -> Objetos da mesma classe temos atributos porem estado diferentes 
		//Exemplo abstração -> Escola ou pessoa porem atributos que importar em um ambiente 
public class Main {

	public static void main(String[] args) {
		
		/*
		 * Uma caneta Azul Ponta 0.5 Modelo null Carga 0
		 * La da classe Pen 
		 */
		Pen Pen = new Pen();
		Pen.cor = "Azul";
		Pen.ponta = 0.5f;
		Pen.tampada=true;
		
		//Chamando o método rabiscar da classe Pen verifica se ta tampada ou destampada
		Pen.status();
		Pen.rabiscar();
		
		//Instanciando um novo objeto pen mesmo atribitos e mesmo metodos  mudando estado ou valor de atributo 
		Pen Pen2 = new Pen();
		Pen2.modelo="Bic";
		Pen2.cor="Preta";
		Pen2.ponta=0.9f;
		Pen2.tampada=false;
		
		
		Pen2.tampar();
		Pen2.status();
		
		
				
		
	}

}
