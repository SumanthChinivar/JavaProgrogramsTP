package stringPrograms;

public class Rev_without_length {
	public static void main(String[] args) {
//		String inp="Pyramid";
//		char[] chr = inp.toCharArray();
//		String out="";
//		for(char c:chr)
//		{
//			out=c+out;
//		}
//		System.out.println(out);
		
		
		String input="Pyramid";
		String op="";
		int i=0;
		while(true) {
			try {
				char ch=input.charAt(i);
				op=ch+op;
				i++;
			}catch(StringIndexOutOfBoundsException s) {
				break;
			}
		}
		System.out.println(op);
	}
}
