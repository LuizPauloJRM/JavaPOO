package GeteSet;

public class Desenvolvedor {
	public String funcao;
	private float nivel;
	private String tecnologia;
	private boolean experiencia;
	
	//Método construtor 
	public Desenvolvedor() {
		this.experiencia();
		this.tecnologia();
	}
	
	
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public float getNivel() {
		return nivel;
	}
	public void setNivel(float nivel) {
		this.nivel = nivel;
	}
	public void experiencia() {
		this.experiencia=true;
	}
	
	public void tecnologia() {
		return;
	}
	public void status() {
		System.out.println("Sobre o desenvolvedor "+this.funcao);
		System.out.println("Nivel: " +this.nivel);
		System.out.println("Experiencia: " +this.experiencia);
		System.out.println("tecnologia: " +this.tecnologia);
	}
}
