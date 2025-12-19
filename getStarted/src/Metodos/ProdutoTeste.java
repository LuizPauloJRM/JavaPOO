package Metodos;

public class ProdutoTeste {
	public static void main(String[] args) {
		// objetos instanciados da classe produtos
//		public class Produtos {
//			String nome ; 
//			double preco;
//			double desconto; 
//		{
		// tipo nomeMetodo(tipo nome ,tipo nome, ...){
		// corpo do metodo
//	}
		Produtos eletronico = new Produtos();
		eletronico.nome = "Notebook Acer 3500U rizen 5";
		eletronico.desconto = 0.25;
		eletronico.preco = 4380.00;
		
		Produtos utilitarios = new Produtos();
		utilitarios.nome="Lampada led";
		utilitarios.desconto = 0.10;
		utilitarios.preco = 26.90;
		
		System.out.println(eletronico.nome);
		System.out.println(utilitarios.nome);
		
		// chamada do método com calculo de deconto na classe produtos
		double precoFinalEletronico = eletronico.precoComDesconto();
		double precoFinalUtilitarios = utilitarios.precoComDesconto();
		// Sem uso de método
//		double precoFinalEletronico = eletronico.preco*(1-eletronico.desconto);
		double mediaCarrinho = (precoFinalEletronico + precoFinalUtilitarios) / 2;
		

		System.out.printf("Carrinho : R$%.2f." , mediaCarrinho);
	}

}
