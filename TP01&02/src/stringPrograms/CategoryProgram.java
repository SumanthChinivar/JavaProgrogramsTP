package stringPrograms;

public class CategoryProgram {
	public static void main(String[] args) {
		String input="a1b6^&jsjdh899+";
		String special="";
		String number="";
		String alphabet="";
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				alphabet+=ch;
			}else if(ch>='0' && ch<='9') {
				number+=ch;
			}else
				special+=ch;
		}
		System.out.println("Alphabet: "+alphabet);
		System.out.println("Number: "+number);
		System.out.println("SpecialCharacter: "+special);
	}
}
