package arraySorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {2,6,4,1,5,3,7,9,8};
		System.out.println(Arrays.toString(a));
		bubbleSort(a);
		System.out.println(Arrays.toString(a));

	}

	public static int[] bubbleSort(int[] a) {
		for(int i =0; i<a.length-1; i++) {
		for(int j =0; j<a.length-1-i; j++)
		{
			if(a[j+1]<a[j])
			{
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
		}
		return a;
		
	}

}
