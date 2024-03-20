package classesMetodosGenericos;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		
		List<Dog> dogs = new ArrayList<>();
		// Não compila, apesar de Dog ser um Animal
		List<Animal> animals = dogs;
		
		// O uso de listas genéricas é mais seguro se comparado a arrays
		
	}
}