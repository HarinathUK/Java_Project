package array;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a = {9,8,0,6,7,8,7,3,8};
		for(int i =0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++) {
			if(a[i]==a[j])
				a[j] = 0;
		}
		}
		for(int i =0; i<a.length; i++) {
			if(a[i] != 0)
			{
				System.out.print(a[i]+" ");
			}
		}

	}

}
