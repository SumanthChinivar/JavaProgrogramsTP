package stringPrograms;

public class CompressString {
	public static void main(String[] args) {
		String s1="aabbccaa";
		//output a2b2c2a2
		int i,count=1;
		String op="";
		for(i=0;i<s1.length()-1;i++) {
			if(s1.charAt(i)==s1.charAt(i+1)) {
				count++;
			}else {
				op=op+s1.charAt(i)+count;
				count=1;
			}
		}
		if(i==s1.length()-1) {
			op=op+s1.charAt(i)+count;
		}
		System.out.println(op);
	}
}
