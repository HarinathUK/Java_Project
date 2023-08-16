package com.hari.basics;

public class Practice implements Cloneable {
	int i;
	String name;
	int age;
	P2 p1;

	public Practice(int i,String name, int age,P2 p1) {
		super();
		this.i = i;
		this.name = name;
		this.age = age;
		this.p1 = p1;
	}

	
	@Override
	public String toString() {
		return "Practice [i=" + i + ", name=" + name + ", age=" + age + ", p1=" + p1 + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Practice)) return false;
		Practice p=(Practice)obj;
		return this.i==p.i && this.name.equals(p.name) && this.age==p.age && this.p1.equals(p.p1) ;
		
	} 
}
