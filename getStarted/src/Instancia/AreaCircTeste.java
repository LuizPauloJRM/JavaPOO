package Instancia;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a1= new AreaCirc(5.6);
//		a.pi = 10 ; 
		System.out.println(a1.area());
		
		AreaCirc a2 = new AreaCirc(5);
//		a2.pi = 5 ; 
		
		//Acesso diretamente a partir da classe 
		//Os dois usam o Pi 
		AreaCirc.pi = 3.1415;
		
		System.out.println(a1.area());
		System.out.println(a2.area());
	}
	
}
