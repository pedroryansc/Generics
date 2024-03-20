package classesMetodosGenericos;

public class Main3 {
	public static void main(String[] args) {
		
		Cat[] cats = new Cat[2];
		System.out.println(cats.length);
		Animal[] animals = cats;
		System.out.println(animals.length);
	
	}
}