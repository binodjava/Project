package com.clone.shallow;

class Course {
	String subject1;
	String subject2;
	String subject3;

	public Course(String sub1, String sub2, String sub3) {
		this.subject1 = sub1;
		this.subject2 = sub2;
		this.subject3 = sub3;
	}
}

class Student implements Cloneable {
	int id;
	String name;
	Course course;

	public Student(int id, String name, Course course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	// Default version of clone() method. It creates shallow copy of an object.

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ShallowCopy {
	public static void main(String[] args) {
		Course science = new Course("Physics", "Chemistry", "Biology");
		Student student1 = new Student(111, "John", science);
		Student student2 = null;
		try {
			student2 = (Student) student1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(student1.course.subject3); // Output : Biology
		System.out.println(student2.course.subject3); // Output : Biology

		student2.course.subject3 = "Maths";
		System.out.println(student1.course.subject3); // Output : Maths
		System.out.println(student2.course.subject3); // Output : Maths
		
		
//		Any changes made to cloned object will be reflected in original object or vice versa.
		
		
		
		
		
/*		
		Shallow Copy:-
		Cloned Object and original object are not 100% disjoint.
		Any changes made to cloned object will be reflected in original object or vice versa.
		Default version of clone method creates the shallow copy of an object.
		Shallow copy is preferred if an object has only primitive fields.
		Shallow copy is fast and also less expensive.
		
		Deep Copy:-
		Cloned Object and original object are 100% disjoint.
		Any changes made to cloned object will not be reflected in original object or vice versa.
		To create the deep copy of an object, you have to override clone method.
		Deep copy is preferred if an object has references to other objects as fields.
		Deep copy is slow and very expensive.
		
		
		
		
		
		Summary:-Shallow, Deep & Lazy
		In shallow copy, only fields of primitive data type are copied while the objects references are not copied. Deep copy involves the 
		copy of primitive data type as well as objet references. There is no hard and fast rule as to when to do shallow copy and when to do 
		a deep copy. 
		Lazy copy is a combination of both of these approaches.
		
		
		If only primitive type fields or Immutable objects are there then there is no difference between shallow and deep copy in Java.
		
		
		
		A shallow copy of an object copies the ‘main’ object, but doesn’t copy the inner objects. The ‘inner objects’ are shared between the 
		original object and its copy.
		
		
		
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
