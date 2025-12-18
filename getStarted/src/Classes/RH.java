package Classes;

public class RH {

	// Teste do RH
	// Metodo main para usar o produto
	public static void main(String[] args) {
		// Criando o objeto , instanciando um objeto com atributos
		// Luiz tem email , nome , salário , idade
		// Funcionario tipo Luiz
		Funcionario Luiz = new Funcionario();
		Luiz.salario = 1.800;
		Luiz.idade = 26;
		Luiz.email = "luizpaulo@email.com";
		Luiz.funcao = "Desenvolvedor 1";
		Luiz.desconto = 0.10;

		// Instanciando outro objeto a partir do modelo funcionario "Classe "
		Funcionario Carlos = new Funcionario();
		Luiz.salario = 2.800;
		Carlos.idade = 25;
		Carlos.email = "Carlos@email.com";
		Carlos.funcao = "Desenvolvedor 2";
		Carlos.desconto = 0.20;
//		Funcionario Rogério = new Funcionario();
//		Funcionario Douglas = new Funcionario();
//		

		
	}
}
