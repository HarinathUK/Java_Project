 class MaxOccuredChar {

	public static void main(String[] args) {
		int[] a = {1,1,5,8,7,8,6,5,4,5};
		int max = 0;
		int res = 0;
		for(int i =0; i<a.length-1; i++)
		{
			
			int count = 1;
			
			for(int j =i+1; i<a.length; j++)
			{
				if(a[i]==a[j] && a[i]!=0)
				{
					count++;
					a[j] = 0;
				}
			}
			if(count>max)
				max = count;
				res = a[i];
		}
		System.out.println(res);

	}

}
