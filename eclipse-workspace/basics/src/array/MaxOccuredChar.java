package array;

public class MaxOccuredChar {

	public static void main(String[] args) {
		int[] a = {1,1,2,2,3,3,3,4,4,6};
		int max = 0;
		int res = 0;
		for(int i =0; i<a.length-1; i++)
		{
			int count = 1;
			for(int j =i+1; j<a.length; j++)
			{
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>max) {
				max = count;
				res = a[i];
			}
		}
		System.out.println(res);

	}

}
