package collections;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * [10,20,30,40,25]
 * [10,45,30,68]
 * [20,45,40,25,68]
 */
public class A9 {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,25};
		int	[] b= {20,45,30,68};
		Arrays.asList(a);
		ArrayList c=new ArrayList();
		for(int i=0;i<Math.max(a.length, b.length);i++) {
			if(i<a.length && !c.contains(a[i])) {
				c.add(a[i]);
			}else if(i<a.length && c.contains(a[i])) {
				c.remove(a[i]);
			}
			
			if(i<b.length && !c.contains(b[i])) {
				c.add(b[i]);
			}else if(i<b.length && c.contains(b[i])) {
				c.remove(b[i]);
			}
		}
		System.out.println(c);
		}
	
}
