package arraySorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {2,6,4,1,5,3,7,9,8};
		System.out.println(Arrays.toString(a));
		selectionSort(a);
		System.out.println(Arrays.toString(a));

	}

	public static int[] selectionSort(int[] a) {
		for(int i = 0; i<a.length-1; i++)
		{
			int index = i;
			for(int j = i+1; j<a.length; j++) {
				if(a[j]<a[index])
					index = j;
			}
				if(i!=index) {
				int temp = a[i];
				a[i] = a[index]; 
				a[index] = temp;
				}
			}
		
		return a;
		
	}

}
