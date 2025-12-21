package Instancia;

public class AreaCirc {
	double raio;
//	double pi = 3.14;
	
	//O valor de Pi esta associado diretamente a classe 
	static double pi = 3.14;

	// Criar um construtor
	AreaCirc(double raioInicial) {
//		pi = 3.14;
		// Peguei o raio e settei na variavel raio
		raio = raioInicial;

	}

	double area() {
		return pi * Math.pow(raio, 2);
//		return raio * raio * pi ;
	}
}
