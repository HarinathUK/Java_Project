class Pattern11 
{
	public static void main(String[] args) 
	{
		int n=5;
		int k = n;
		for (int i =1; i<=n; i++)
		{
			for (int j=1; j<=n; j++)
			{
				if(i==j)
					System.out.print("*");
				else
					System.out.print(k);
					k--;
			}
			k += n;
			System.out.println();
		}
		
	}
}