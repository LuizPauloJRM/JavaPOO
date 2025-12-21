package Construtores;

public class DatasTeste {
	public static void main(String[] args) {
		Datas primeiraData = new Datas();
		
		//Por padrão vai usar esses valores passados por parametros
		Datas segundaData = new Datas(31,12,2020);
//		segundaData.dia = 29;
//		segundaData.mes = 9;
//		segundaData.ano = 1990;
		
		String datasFormatadas1 = primeiraData.obterDatasFormatadas();
		System.out.println(datasFormatadas1);
		System.out.println(primeiraData.obterDatasFormatadas());
		
		
		primeiraData.mostrarDataFormatada();
		segundaData.mostrarDataFormatada();
		
	}
	
}
