package frutas;

import java.util.ArrayList;
import java.util.List;

public class LBanana3 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		Uva b = new Uva("Verde");
		list.add(b);
		Banana b1 = (Banana) list.get(0);
		System.out.println(b1.toString());
		
	}
}