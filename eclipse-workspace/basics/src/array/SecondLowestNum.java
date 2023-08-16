package array;

public class SecondLowestNum {

	public static void main(String[] args) {
		int[] a = {12,5,3,8,9,6,12};
		int min1 = a[0];
		int min2 = a[0];
		for(int i =0; i<a.length; i++)
		{
			if(a[i]<min1)
			{
				min2 = min1;
				min1 = a[i];
			}
			else if(a[i]<min2)
			{
				if(a[i]!=min1)
				min2 = a[i];
			}
		}
		System.out.println(min2);

	}

}
