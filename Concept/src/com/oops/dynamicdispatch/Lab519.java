package com.oops.dynamicdispatch;

public class Lab519 {
	public static void main(String[] args) {
		Person p=null;
		p=new Student();
		p.walking();
		p=new Employee();
		p.walking();
	}

}

/*Student->walking()
Employee->Walking()*/

//Method is present in sub class, so that jvm has printed sub class method