package collections;

import java.util.ArrayList;

public class A3 {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList();
		a.add("Panipuri");
		a.add("Golgappa");
		a.add("Gobi");
		a.add("Burger");
		a.add("Bajji");
		a.add(0,"Pizza");
		
		
		System.out.println(a);
		
		System.out.println(a.contains("Panipuri"));
		System.out.println(a.indexOf("Gobi"));
		
		Object[] o=a.toArray();
	}
}
