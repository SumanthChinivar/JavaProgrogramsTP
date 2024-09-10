package collections;

import java.util.HashMap;

public class M4 {
public static void main(String[] args) {
	HashMap hs=new HashMap();
	hs.put(1,2);
	hs.put(2,3);
	hs.put(3,4);
	
//	System.out.println(hs.containsKey(5));
//	System.out.println(hs.containsValue(7));
	System.out.println(hs.containsKey(3));
	System.out.println(hs.containsValue(4));
//	System.out.println(hs.isEmpty());
//	hs.clear();
//	System.out.println(hs.isEmpty());
}
}
