class Pattern30 
{
	public static void main(String[] args) 
	{
		int n =5;
		int k =1;
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=n; j++)
			{
				if (i%2!=0)
					System.out.print(k++ + "\t");
				else
					System.out.print(--k + "\t");
			}
			System.out.println();
			k +=n;

		}
	}
}
