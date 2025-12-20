package Metodos;

public class Data {
	int dia ; 
	int mes; 
	int ano;
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d",dia , mes ,ano);
	}
	//Ausencia de retorno
	void imprimirDataFormatada(){
		System.out.printf("%d/%d/%d\n",dia , mes ,ano);
	}
}
