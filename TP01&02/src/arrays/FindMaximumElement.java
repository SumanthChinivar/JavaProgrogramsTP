package arrays;

public class FindMaximumElement {
	public static void main(String[] args) {
		int[] a= {20,100,-10,600,50};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
		
	}
}
