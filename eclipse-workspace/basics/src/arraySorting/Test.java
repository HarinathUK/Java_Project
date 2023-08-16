package arraySorting;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] a = {2,6,4,1,5,3,7,9,8};
		for(int i =0; i<a.length-1; i++)
		{
			int index = i;
			for(int j = i+1; j<a.length; j++)
			{
				if(a[j]<a[index])
				{
					index = j;
				}
				if(i!=index) {
					int temp = a[i];
					a[i] = a[index];
					a[index] = temp;
				}
				
				
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
