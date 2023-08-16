class Pattern31 
{
	public static void main(String[] args) 
	{
		int n =9;
		/*int num2 = n-2;
		for (int i=1; i<=n; i++)
		{
			int k =1;
			if (i<=n/2+1)
			{
				for (int j=1; j<=n/2+1-i; j++)
					System.out.print(" ");
				for (int j=1; j<=(2*i)-1; j++)
				{
					if (j<=((2*i)-1)/2)
						System.out.print(k++);	
					else
						System.out.print(k--);
				}
				k -=2;
			}
			else
				{
				for (int j=1; j<=i-(n/2+1); j++)
					System.out.print(" ");
				for (int j=1; j<=num2; j++)
				{
					if (j<=(num2)/2)
						System.out.print(k++);	
					else
						System.out.print(k--);
				}
				k -=2;
				num2 -=2;
			}
			System.out.println();
			


		}*/

		for(int i = 1; i<=n/2+1; i++){
			print(i,n);
		}
		for(int i = n/2; i>=1; i--){
			print(i,n);
		}
		
	}

	public static void print(int i, int n){
		for(int s=1; s<=n/2+1-i; s++)
			System.out.print(" ");
		int k = 0;
		for(int j = 1; j<=(i*2)-1; j++){
			if(j<=i)
				k++;
			else
				k--;
			System.out.print(k);
		}
		System.out.println();
	}

}