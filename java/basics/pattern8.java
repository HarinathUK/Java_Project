class Pattern8 
{
	public static void main(String[] args) 
	{
		int n =20;
		if (n%2==0)
		{
			n--;
		}
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=n; j++)
			{
				if (i==j||j==n-(i-1))
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
