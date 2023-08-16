class E 
{
	static int i;
	int j;
	void increment() 
	{
		i++;
		j++;
	}
	void display()
	{
		System.out.println(i+ " - " +j);
	}
}
class Test
	{
		public static void main(String[] args)
		{
			System.out.println("start");
			E e1 = new E();
			E e2 = new E();
			E e3 = new E();
			e1.increment();
			e2.increment();
			e3.increment();
			e1.display();
			e2.display();
			e3.display();
		}
	}
