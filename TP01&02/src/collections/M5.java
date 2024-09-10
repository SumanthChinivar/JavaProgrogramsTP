package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class M5 {
	public static void main(String[] args) {
		HashMap hs = new HashMap();
		hs.put("T123", "Anusha");
		hs.put("T124", "Nadhiya");
		hs.put("T125", "Nivitha");
		hs.put("T126", "Venkat");
		hs.put("T127", "Avinash");
		
		System.out.println(hs);
		hs.replace("T125","NASA");
		System.out.println(hs);
		hs.replace("T125","NASA","Nivitha");
		System.out.println(hs);
	}
}
