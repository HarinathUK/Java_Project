package array;

public class SecondHighestNum {

	public static void main(String[] args) {
		int[] a = {12,5,3,8,9,6,12};
		int max1 = 0;
		int max2 = 0;
		for(int i =0; i<a.length; i++)
		{
			if(a[i]>max1)
			{
				max2 = max1;
				max1 = a[i];
			}
			else if(a[i]>max2)
			{
				if(a[i]!=max1)
				max2 = a[i];
			}
		}
		System.out.println(max2);
	}

}
