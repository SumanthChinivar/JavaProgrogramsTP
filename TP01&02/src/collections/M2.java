package collections;

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

public class M2 {
	public static void main(String[] args) {
		HashMap hs=new HashMap();
		hs.put(1,2);
		hs.put(2,3);
		hs.put(3,4);
		System.out.println(hs);
		hs.remove(1);
		System.out.println(hs);
		hs.remove(2, 3);
		System.out.println(hs);
	}
}
