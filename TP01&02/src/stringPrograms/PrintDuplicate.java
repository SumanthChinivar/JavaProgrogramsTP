package stringPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintDuplicate {
	public static void main(String[] args) {
		String s = "india";//i=2 n=1, d=1, a=1
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else
				map.put(ch, 1);
		}
		
//		System.out.println(map.keySet());
		for(Map.Entry<Character,Integer> data:map.entrySet()) {
				System.out.print(data.getKey());
		}
		
	}
}
