package collections;

import java.util.ArrayList;
import java.util.function.Consumer;

public class A7 {
	public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList();
	a.add(10);
	a.add(21);
	a.add(341);
	a.add(41);
	
	Consumer c=(b)->{
		if((Integer)b%2==0) {
			System.out.println("Even");
		}else
			System.out.println("Odd");
	};
	a.forEach(c);
	}
}
