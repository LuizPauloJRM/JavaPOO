package IntroducaoPOO;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		
		ArrayList<String> listaNomes = new ArrayList<>();
		listaNomes.add("Luiz");
		listaNomes.add("Maria");
		listaNomes.add("Maia");
		listaNomes.add("Maria");
		listaNomes.add("Paulo");
		
		listaNomes.remove(0);
		System.out.println(listaNomes.get(0));
	}
}
