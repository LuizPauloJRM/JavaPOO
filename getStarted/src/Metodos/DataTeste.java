package Metodos;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 =  new Data();
		data1.dia = 12;
		data1.mes = 02;
		data1.ano = 2027;
		
		var  data2 = new Data();
		data2.dia = 31;
		data2.mes = 03;
		data2.ano = 2025;
		
		String dataFormatada1 = data1.obterDataFormatada();
		System.out.println(dataFormatada1);
		
//		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
		
		data1.imprimirDataFormatada();
		data2.imprimirDataFormatada();
	}
}
