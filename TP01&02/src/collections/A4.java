package collections;

import java.util.ArrayList;

public class A4 {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList();
		a.add("Puffs");
		a.add("Cup cake");
		a.add("Brownie");
		a.add("Chocolate");
		a.add("Bread");
		a.add("Rusk");
		
		for(int i=0;i<a.size();i++)
		System.out.println(a.get(i).length());
	}
}
