package stringPrograms;

public class FirstLetterToUppercase {
	public static void main(String[] args) {
		String s="India are world champions in 2024"; //Output: Welecome To Tp Office
		String[] str = s.split(" ");// |Welcome | to | tp | office
		for(int i=0;i<str.length;i++) {
			//first character to upper case
			String s1=str[i];
			s1=Character.toUpperCase(s1.charAt(0))+s1.substring(1);
			System.out.print(s1+" ");
		}
	}
}
