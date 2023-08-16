package exception_handling;

public class Demo5 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		try {
			System.out.println(a[100]);
		}
		catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Handled-Block-1");
		}
		catch(Exception e) {
			System.out.println("Exception-Block");
		}

	}

}
