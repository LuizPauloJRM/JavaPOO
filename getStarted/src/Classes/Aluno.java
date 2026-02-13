package Classes;

public class Aluno {
	//Classe do tipo Aluno 
	//Classe/ Objeto que representa aluno com seus atributos 
	//São atributos de um aluno 
	public String nome; 
	public int idade; 
	public float nota;
	public String dataNascimento;
	public String cpf;
	public int matricula;
	
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
	
	
	//Setters e Getters do objeto 
	//set Receber adicionar dados para os atributos 
	//get Retorna para obter valor  resgatar valor do atributo 
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public void setNome(String nome) {
		this.nome = nome;//Referencia "This" para atributo da classe 
	}
	
	//retorna um texto um nome 
		public String getNome() {
		return nome;
	}
	
	
}
