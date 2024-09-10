package stringPrograms;

public class ReverseWordsInASentence {
	public static void main(String[] args) {
		String str = "My name is Dora";
		// output: yM eman si aroD
		String[] arr = str.split(" ");
		// outer loop is used to iterate the array
		for (int i = 0; i < arr.length; i++) {
			// inner loop is used reverse
			String input = arr[i];
			for (int j = input.length() - 1; j >= 0; j--) {
				System.out.print(input.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
