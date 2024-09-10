package stringPrograms;

import java.util.HashMap;

public class NumOfOcc {

	public static void main(String[] args) {
		String s = "welcome to tp welcome to gc18";
		
		String[] str = s.split(" ");
		// o/p gc18 to welcome tp to welcome
		// o/p welcome-2,to-2,tp-1,gc18-1
		// o/p welcome to
		// o/p tp gc18
		//o/p welcome to tp gc18
		HashMap<String, Integer> map = new HashMap();
		for (int i = 0; i < str.length; i++) {
			String word = str[i];
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else
				map.put(word, 1);
		}
		System.out.println(map);
	} 
}
