package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class A8 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(new Student("Sumanth", 21));
		a.add(new Student("Saketh", 34));

		Comparator c = (o1, o2) -> {
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;
			return s1.name.compareTo(s2.name);
		};

		Collections.sort(a, c);
		System.out.println(a);

		Comparator c1 = (o1, o2) -> {
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;
			if (s1.id > s2.id) {
				return 1;
			} else if (s1.id == s2.id) {
				return 0;
			} else
				return -1;
		};

		Collections.sort(a, c1);
		System.out.println(a);
	}
}

class Student {
	String name;
	int id;

	Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return name + "-" + id;
	}
}