package stringPrograms;

public class SumOfNumberInString {
	public static void main(String[] args) {
		String input="a1234ffff4432";
		int sum=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch>='0' && ch<='9') {
				sum=sum+ch-48;
			}
		}
		System.out.println("The sum is:"+sum);
	}
}
