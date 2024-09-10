package collections;

import java.util.ArrayList;

public class A2 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Sakshi");
		a.add("Sumitha");
		a.add("Ragini");
		a.add("Raman");
		
		System.out.println(a);
		
		a.remove(0);
		System.out.println(a);
		
		a.remove("Ragini");
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
	}
}