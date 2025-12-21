package Construtores;

public class Datas {
	int dia ; 
	int mes ; 
	int ano ; 
	
	//Construtor padrão 
	Datas (){
		dia = 1;
		mes = 1; 
		ano = 1999;
		
	}
	Datas(int diaInicial , int mesInicial , int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	String obterDatasFormatadas() {
		return String.format("%d/%d/%d",dia , mes , ano  );
	}
	void mostrarDataFormatada() {
		System.out.println(obterDatasFormatadas());
	}
}
