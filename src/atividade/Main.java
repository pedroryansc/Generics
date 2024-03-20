package atividade;

public class Main {
	public static void main(String[] args) {
		
		Integer[] anArray = {1, 2, 3, 4, 5};
		int valor = 3; // ou Integer
		
		// Vetor<Integer> v = new Vetor<>(anArray);
		// System.out.println(Comp2.countGreaterThan(v.getVetorT(), valor));
		
		System.out.println(Comp2.countGreaterThan(anArray, valor));
		
	}
}