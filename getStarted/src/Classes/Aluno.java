package Classes;

public class Aluno {
	//Classe do tipo Aluno 
	//Classe/ Objeto que representa aluno com seus atributos 
	//São atributos de um aluno 
	public String nome; 
	public int idade; 
	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;
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
	
	//Método de calcular notas somar dividir e retornar valor 
	//Podemos fazer esse método aqui mesmo dentro do objeto/Classe 
	//Precisa ser acessivel 
	//Método que retorna média do aluno
	public double getMediaNota() {
		return (nota1 + nota2 + nota3 + nota4 / 4);
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
	public double getNota1() {
		return nota1;
	}
	public void setNota1(float nota) {
		this.nota1 = nota;
	}
	
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
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
