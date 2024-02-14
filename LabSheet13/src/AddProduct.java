import java.io.*;
import java.util.*;
public class AddProduct {
	public static void main(String[] args) throws IOException {
		//create object for write (save) data to File using PrintWriter Class
		PrintWriter writeFile = new PrintWriter(new FileWriter("d://txtFile//product.txt",true));
		//create object for input data from keyboard(console)
		Scanner scan = new Scanner(System.in);
		//Display and input data from keyboard
		System.out.print("Input product id:");
		String productId = scan.next();
		System.out.print("Input product Name:");
		String productName = scan.next();
		System.out.print("Input product Unit:");
		int productUnit = scan.nextInt();
		System.out.print("Input product Price:");
		float productPrice = scan.nextFloat();
		//save data to file
		writeFile.println(productId+","+productName+","+productUnit+","+productPrice);
		System.out.println("Save file already...");
		
		writeFile.close();
	}

}
