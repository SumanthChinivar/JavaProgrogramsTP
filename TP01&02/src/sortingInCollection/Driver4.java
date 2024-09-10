package sortingInCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Driver4 {
	public static void main(String[] args) {
		ArrayList<Student> a=new ArrayList();
		a.add(new Student("Vivek",89));
		a.add(new Student("Sindhu",78));
		a.add(new Student("Shiny",91));
		
//		Comparator c=(o1,o2)->{
//			Student s1=(Student)o1;
//			Student s2=(Student)o2;
//			if(s1.id<s2.id) {
//				return -1;
//			}else if(s1.id>s2.id) { 
//				return 1;
//			}else
//				return 0;
//		};
//		
//		System.out.println(a);
//		Collections.sort(a,(o1,o2)->{
//			Student s1=(Student)o1;
//			Student s2=(Student)o2;
//			if(s1.id<s2.id) {
//				return -1;
//			}else if(s1.id>s2.id) {
//				return 1;
//			}else
//				return 0;
//		});
//		System.out.println(a);
		
		a.set(0, new Student("Nitin",59));
		System.out.println(a);
	}
}
