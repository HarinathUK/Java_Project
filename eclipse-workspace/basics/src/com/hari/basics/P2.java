package com.hari.basics;

public class P2 {
	int id;
	String mobile;
	public P2(int id, String mobile) {
		super();
		this.id = id;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "P2 [id=" + id + ", mobile=" + mobile + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof P2)) return false;
		
		P2 p1 = (P2)obj;
		return this.id==p1.id && this.mobile==p1.mobile;
	}
}
