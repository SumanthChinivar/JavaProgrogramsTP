package stringPrograms;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
		String str1="net";
		String str2="TEN";
		boolean flag=true;
		
		if(str1.length()!=str2.length()) {
			flag=false;
			System.out.println("Not an anagram");
			return;
		}else
		{
			str1=str1.toLowerCase();//race
			str2=str2.toLowerCase();//care
			
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]!=ch2[i]) {
					flag=false;
					System.out.println("Not an anagram");
					break;
				}
			}
		}
		if(flag) {
			System.out.println("Anagrams");
		}	
	}
}
