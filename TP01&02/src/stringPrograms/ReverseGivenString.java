package stringPrograms;

import java.util.HashMap;

public class ReverseGivenString {

	public static void main(String[] args) {
		
		String s="welcome to tp welcome to gc18";
		String[] str = s.split(" ");
		
		for (int i = str.length-1; i >=0; i--) {
			System.out.print(str[i]+" ");
		}
		
		
	}
}
