package com.clone.deep;

class Course implements Cloneable {
	String subject1;
	String subject2;
	String subject3;

	public Course(String sub1, String sub2, String sub3) {
		this.subject1 = sub1;
		this.subject2 = sub2;
		this.subject3 = sub3;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
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

	// Overriding clone() method to create a deep copy of an object.
	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();
		student.course = (Course) course.clone();
		return student;
	}
}

public class DeepCopy {
	public static void main(String[] args) {
		Course science = new Course("Physics", "Chemistry", "Biology");
		Student student1 = new Student(111, "John", science);
		Student student2 = null;
		try {
			student2 = (Student) student1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
//		We got exact copy od object
		System.out.println(student1.course.subject3); // Output : Biology
		System.out.println(student2.course.subject3); // Output : Biology
		
		
//		But after changing clone object, not reflected in origianl one,,,coz both object have diff address
		student2.course.subject3 = "Maths";
		System.out.println(student1.course.subject3); // Output : Biology
		System.out.println(student2.course.subject3);// Output : Maths
	}
}