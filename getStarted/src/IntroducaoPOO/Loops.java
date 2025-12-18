package IntroducaoPOO;

public class Loops {
	public static void main(String[] args) {
		// Iterações com for : enquanto a condição não é atingida while ate que a
		// cndição seja atingida
//	1,2,3,4,5,6,7,8,9
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		//Até alcançar  o valor 10 
		int contador = 1 ;
		while (contador < 10) {
			System.out.println("Entrou no while");
			contador ++ ;
		}
	}
}
