package stringPrograms;

public class SwappingFirstAndLastWord {
	public static void main(String[] args) {
		String input="My name is Bheem and I am Dholakpur";
		String[] arr = input.split(" ");
		String temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		
		for(String s:arr) {
			System.out.print(s+" ");
		}
	}
}
