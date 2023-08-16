package arraySorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = {2,6,4,1,5,3,7,9,8};
		System.out.println(Arrays.toString(a));
		insertionSort(a);
		System.out.println(Arrays.toString(a));


	}

	public static int[] insertionSort(int[] a) {
		for(int i =1; i<a.length-1; i++)
		{
			int key = a[i];
			int j = i-1;
			while(j>=0 && key<a[j])
			{
				a[j+1] = a[j];
				j--;
			}
				a[j+1] = key;
		}
		return a;
	}

}
