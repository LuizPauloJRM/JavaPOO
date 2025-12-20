package Construtores;

public class Produto {
	String nome ; 
	double preco;
	double desconto; 
	
	//Construtor padrao 
	Produto(){
		
	}
	
	//void na frente do construtor passa a ser um metodo normal 
	
	//Passando parametros
	Produto(String nomeInicial , double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}

	//Método
	//Não preciso passar parametros porque dentro da classe produtos tenho os atributos que precisa 
	//Parametro
	double precoComDesconto () {
		return preco  * (1 - desconto);
	}
}	