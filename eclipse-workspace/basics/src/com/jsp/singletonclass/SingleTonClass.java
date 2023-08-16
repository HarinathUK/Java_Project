package com.jsp.singletonclass;

class SingleTonClass {
	static SingleTonClass obj;
	int i;
	int j;
	private SingleTonClass() {
		
		i = 20;
		j = 30;
		
		System.out.println("i:" + i + " j:" + j);
	}
	
	public static SingleTonClass getInstance()
	{
		if (obj == null)
			 obj = new SingleTonClass();
		
		return obj;
	}
	
	
	
}

