package sortingInCollection;

import java.util.ArrayList;
import java.util.Collections;

public class Driver3 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(new Student("Vivek",89));
		a.add(new Student("Sindhu",78));
		
		System.out.println(a);
		
		Collections.sort(a);
		System.out.println(a);
	}
}
//Collections.sort(a);
//comparing
//comparable---->Class implements -->comparable type
//String, Integer, Float, Character, Boolean--->comparable type

/*
 class String implements Comparable
 {
 :
 :
 :
 :
 public int compareTo(Object o){
 3,4--->negative
 4,2--->positive
 4,4--->0
 }
 }
 */