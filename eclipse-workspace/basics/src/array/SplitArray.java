package array;

import java.util.Arrays;

public class SplitArray {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7,8};
		int[] b = new int[4];
		int[] c = new int[4];
		for(int i =0; i<a.length; i++)
		{
			if(i<4)
			b[i] = a[i];
			else
			c[i-c.length] = a[i];
		}
		System.out.println("a = "+Arrays.toString(a));
		System.out.println("b = "+Arrays.toString(b));
		System.out.println("c = "+Arrays.toString(c));


	}

}
