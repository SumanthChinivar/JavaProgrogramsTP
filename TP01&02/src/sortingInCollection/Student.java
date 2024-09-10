package sortingInCollection;

/*
 * id,name
 * User should initialize name id
 * toString-name,id
 * Sumanth,78
 */
public class Student {
	String name;
	int id;
	
	public Student(String name,int id) {
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return "("+name+","+id+")";
		
	}
	
//	public int compareTo(Object o) {
//		Student s=(Student)o;
//		return this.name.compareTo(s.name);
//	}
}
