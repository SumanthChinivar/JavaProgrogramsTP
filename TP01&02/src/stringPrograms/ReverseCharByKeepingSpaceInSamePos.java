package stringPrograms;

public class ReverseCharByKeepingSpaceInSamePos {

	public static void main(String[] args) {

		String s = "i love india";
		String spaceRemove = s.replace(" ", "");

		for (int i = spaceRemove.length() - 1, j = 0; j <= s.length() - 1; j++) {

			if (s.charAt(j) == ' ') {
				System.out.print(' ');
			} else
				System.out.print(spaceRemove.charAt(i--));
		}

	}
}
