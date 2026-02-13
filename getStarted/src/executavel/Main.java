package executavel;

//Quando não esta no mesmo pacote preciso importar essa Classe Aluno 
import Classes.Aluno;

public class Main {
	// Método executável do Java
	public static void main(String[] args) {

		// Criando objetos
		// Iniciando aluno1
		Aluno aluno1 = new Aluno();// Exemplo Joao
		//Agora chama pelo set para poder settar o nome adicionar
		aluno1.setNome("Joao");//Adicionar nome colocando o set para
		aluno1.setCpf("054544211164");
		aluno1.setDataNascimento("03/0481999");
		aluno1.setMatricula(202310962);
		aluno1.setIdade(28);
		
		//Para usar o método de calcular notas 
		//Passando as notas para o objeto armazenado nos atributos da variáveis 
		aluno1.setNota1(7);
		aluno1.setNota2(5);
		aluno1.setNota3(4);
		aluno1.setNota4(6);
		
		//Chamada de método MediaNota executa tudo que tem  dentro do método
		System.out.println("O aluno "+aluno1.getNome()+" teve a Media "+aluno1.getMediaNota());
		System.out.println("Situação do aluno  : " + aluno1.getAlunoAprovado());
	
		
		
		
		System.out.println("nome: "+aluno1.nome);//Ou get nome 
		System.out.println("idade: "+ aluno1.getIdade());
		System.out.println("Data de nascimento: "+aluno1.getDataNascimento());
		System.out.println("Matriculo: "+aluno1.getMatricula());
		System.out.println("CPF: "+aluno1.getCpf());
		
		
		// Aluno. -> Acessa o que tem no aluno "."
		// public consigo acessar os atributos
		// Acesso a atributos
//		aluno1.nome = "Luiz";
//		System.out.println(aluno1.nome);

		// Objeto ainda não existe na memória
		// Aluno aluno1;

		// Instanciando , criando um aluno da classe Aluno
		Aluno aluno2 = new Aluno();// Paulo
		aluno2.nome = "Paulo";
		aluno2.idade = 18;
		aluno2.setNota1(0);
		aluno2.setNota2(4);
		aluno2.setNota3(1);
		aluno2.setNota4(2);
		System.out.println(aluno2.nome + " " + aluno2.idade);
		System.out.println("Situacao: "+aluno2.getAlunoAprovado());
		System.out.println("Nota: "+aluno2.getMediaNota());
		// Objeto do tipo Aluno do tipo da classe

		// Nome padrao com construtor
		Aluno aluno3 = new Aluno("Luiz");

		// Nome e idade
		Aluno aluno4 = new Aluno("Paulo", 45);
	}
}
