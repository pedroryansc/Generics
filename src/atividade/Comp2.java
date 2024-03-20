package atividade;

import java.lang.Comparable;

public class Comp2 {

	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
		int count = 0;
		for(T e : anArray) {
			if(e.compareTo(elem) > 0)
				count++;
		}
		return count;
	}
	
}