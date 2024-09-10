package sortingInCollection;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Add 5 numbers to an array list
 * Collections.sort(ref)
 */
public class A1 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(3);
		a.add(5);
		a.add(21);
		
		System.out.println(a);
//		Collections.reverse(a);
		
		Collections.sort(a);
		
		System.out.println(a);
		
		Collections.reverse(a);
		
		System.out.println(a);
		
		Collections.shuffle(a);
		System.out.println(a);
	}
}
