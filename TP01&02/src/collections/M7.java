package collections;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class M7 {
	public static void main(String[] args) {
		HashMap hs = new HashMap();
		hs.put("T123", "Anusha");
		hs.put("T124", "Nadhiya");
		hs.put("T125", "Nivitha");
		hs.put("T126", "Venkat");
		hs.put("T127", "Avinash");
		
//		BiConsumer b1=(key,value)->System.out.println(key+","+value);
//		
//		hs.forEach(b1);
		
		hs.forEach((key,value)->System.out.println(key+","+value));
	}
}
