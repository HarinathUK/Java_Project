package com.hari.basics;

class Student{
	int id;
	String name;
	int age;
	Student(int id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
		
	}
	
	public void displayDetails() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	Student(int id, Student s, int age){
		this.id =id;
		this.name = s.name;
		this.age = age;
	}
	
	Student(int id, String name, Student s){
		this.id =id;
		this.name = name;
		this.age = s.age;
	}
	
	
}





public class Test1 {

	public static void main(String[] args) {
		Student s1 = new Student(1,"hari",24);
		s1.displayDetails();
		Student s2 = new Student(2,s1,26);
		s2.displayDetails();
		Student s3 = new Student(3,"sai",s2);
		s3.displayDetails();
		
				

	}

}
