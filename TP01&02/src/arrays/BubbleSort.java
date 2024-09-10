package arrays;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a= {12,23,34,4,3};//4 6 12 23 34
		int n=a.length;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		
		String[] s= {"my","name","is","sumanth"};
		//is my name sumanth
	}
}
