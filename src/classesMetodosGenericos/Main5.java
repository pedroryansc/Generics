package classesMetodosGenericos;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		
		List<Dog> dogs = new ArrayList<>();
		List<Animal> animals = dogs; // Não compila, apesar de Dog ser um Animal
		
		// O uso de listas genéricas é mais seguro se comparado a arrays
		
	}
}