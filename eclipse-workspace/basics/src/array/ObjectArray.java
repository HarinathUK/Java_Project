package array;

public class ObjectArray {

	public static void main(String[] args) {
		Object[] obj = new Object[5];
		obj[0] = 10;
		obj[1] = "hari";
		obj[2] = 15.5;
		obj[3] = true;
		for(int i =0; i<obj.length; i++)
		{
			System.out.println(obj[i]);
		}

	}

}
