package collections;

import java.util.HashMap;

public class M1 {
	public static void main(String[] args) {
		HashMap hs=new HashMap();
		hs.put("T123","Anusha");
		hs.put("T124","Nadhiya");
		hs.put("T125","Nivitha");
		hs.put("T126", "Venkat");
		hs.put("T127", "Avinash");
		
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
	}
}
