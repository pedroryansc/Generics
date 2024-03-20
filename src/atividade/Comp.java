package atividade;

public class Comp {

	public static <T> int countGreaterThan(Vetor<T> anArray, T elem) {
		int count = 0;
			for(T e : anArray.getVetorT()) {
				// Compiler error
				if(e > elem)
					count++;
			}
		return count;
	}
	
}