package sortingInCollection;

public class Driver2 {
	public static void main(String[] args) {
		Student[] s1=new Student[2];
		s1[0]=new Student("Rishabh",56);
		s1[1]=new Student("Axar", 34);
		
		for(Student s:s1) {
			System.out.println(s);
		}
	}
}
