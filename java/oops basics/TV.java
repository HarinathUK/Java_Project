class TV 
{
	boolean on = false;
	String channal = "sun";

	void switchOn()
	{
		on = true;
		System.out.println("TV is on");
		System.out.println("Current channal is "+ channal);
	}

	void changeChannal()
	{
		if (on == false)
		{
			System.out.println("First turn on the TV");
			return;
		}
		channal = "vijay";
		System.out.println("Channal changed to "+ channal);

	}
}

class Test2
{
	public static void main(String[] args) 
	{
		TV tv1 = new TV();
		tv1.switchOn();
		tv1.changeChannal();
	}
}
