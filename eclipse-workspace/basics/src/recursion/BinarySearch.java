package recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7,8};
		int start = 0;
		int end = a.length;
		int mid = (start+end)/2;
		System.out.println(search(a,1,start,end,mid));

	}

	public static int search(int[] a, int key, int start, int end, int mid) {
		
		if(start>end) return -1;
		mid = (start+end)/2;
		if(key==a[mid]) return mid;
		else if(key<a[mid]) end = mid-1;
		else start = mid+1;
		return search(a,1,start,end,mid);
	}

}
