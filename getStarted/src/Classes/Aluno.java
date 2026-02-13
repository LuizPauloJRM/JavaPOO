package Classes;

public class Aluno {
	//Classe do tipo Aluno 
	//Classe/ Objeto que representa aluno com seus atributos 
	//São atributos de um aluno 
	public String nome; 
	int idade; 
	float nota;
	String dataNascimento;
	String cpf;
	int matricula;
	
	//Construtor : Cria os dados na memória
	//Exemplo o new chama um construtor 
	//Controi esse objeto na memoria 
	
	public Aluno() {
		
	}
	public Aluno (String nomePadrao) {
		//nome sempre sera o nome padrao do parâmetro
		//Passamos o Valor padrao
		nome= nomePadrao;
		
	}
	
	//Outro Construtor
	public Aluno(String nomePadrao , int idadePadrao) {
		nome = nomePadrao; 
		idade= idadePadrao;
	}
	
	
}
