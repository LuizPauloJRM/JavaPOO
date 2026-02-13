package executavel;

//Quando não esta no mesmo pacote preciso importar essa Classe Aluno 
import Classes.Aluno;

public class Main {
	//Método executável do Java
	public static void main(String[]args) {
		
		
		//Criando objetos
		//Iniciando aluno1
		Aluno aluno1=new Aluno();//Exemplo Joao
		
		//Aluno. -> Acessa o que tem no aluno "."
		//public consigo acessar os atributos
		aluno1.nome = "Luiz";
		System.out.println(aluno1.nome);
		
		//Objeto ainda não existe na memória 
		//Aluno aluno1;
		
		//Instanciando , criando um aluno da classe Aluno 	
		Aluno aluno2= new Aluno();//Luiz
		//Objeto do tipo Aluno do tipo da classe 
		
		//Nome padrao com construtor 
		Aluno aluno3 = new Aluno("Luiz");
		
		//Nome e idade 
		Aluno aluno4 = new Aluno ("Paulo",45);
	}
}
