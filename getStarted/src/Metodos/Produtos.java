package Metodos;

public class Produtos {
	String nome ; 
	double preco;
	double desconto; 
	

	//Método
	//Não preciso passar parametros porque dentro da classe produtos tenho os atributos que precisa 
	//Parametro
	double precoComDesconto () {
		return preco  * (1 - desconto);
	}
	
}
