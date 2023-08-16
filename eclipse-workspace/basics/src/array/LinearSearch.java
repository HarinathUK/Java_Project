package array;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a = {12,5,3,8,9,6};
		int e = 9;
		System.out.println(search(e,a));
	}
	public static int search(int e, int[] a) {
	
		for(int i =0; i<a.length; i++)
		{
			if(a[i]==e)
				return i;
			
		}
		return -1;

}
}
