package exception_handling;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Demo7 {
public static void main(String[] args) throws FileNotFoundException {
	System.out.println("Main Starts");
	
		FileReader r = new FileReader("D:\\java\\basics\\Demo.java");
		System.out.println("Handled");
		System.out.println("Main ends");
}

}
