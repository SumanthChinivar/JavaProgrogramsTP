package stringPrograms;

public class GeneratingPalindromicSubstring {
	public static void main(String[] args) {
		String s="aabaac";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String s1=s.substring(i, j);
				if(s1.length()>=3 && isPalindrome(s1)) {
						System.out.print(s.substring(i,j)+" ");

				}
			}
		}
	}

	public static boolean isPalindrome(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equalsIgnoreCase(str)) {
			return true;
		}
		return false;
	}
}