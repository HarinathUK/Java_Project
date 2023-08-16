package array;
import java.util.Arrays;
public class OddFirstEvenLast {
public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		int[] b = new int[7];
		int j = 0;
		int k = a.length-1;
		for(int i=0; i<a.length; i++)
		{
			if(i%2==0) {
				b[j]=a[i];
				j++;
			}
			else {
				b[k]=a[i];
				k--;
			}			
		}
		System.out.println(Arrays.toString(b));
	}
}
