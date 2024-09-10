package arrays;

public class SecondMaximum {
	public static void main(String[] args) {
		int[] a= {12,34,56,32,12,78,85,79};
		int max=Integer.MIN_VALUE;
		int sec_max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				sec_max=max;
				max=a[i];
			}else if(sec_max<a[i] && max!=a[i]) {
				sec_max=a[i];
			}
		}
		System.out.println(sec_max);
	}
}
