package classesMetodosGenericos;

public class Main2 {
	public static void main(String[] args) {
		
		Pair<Integer,String> p1 = new Pair<>(1, "apple");
		Pair<Integer,String> p2 = new Pair<>(1, "apple");
		boolean same = Util.compare(p1, p2);
		System.out.println(same);
		
	}
}