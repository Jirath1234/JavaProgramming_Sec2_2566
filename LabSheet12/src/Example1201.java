import java.util.Scanner;
import java.io.*;
public class Example1201 {
	public static void main(String[] args) throws IOException {
		//use Scanner Class read data from file
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		while(readFile.hasNext()) {
			String fname = readFile.next(); 
			String lname = readFile.next(); //readFile.next();
			readFile.next(); //read password data
			String email = readFile.next().toUpperCase(); //read email data to email variable
			
			System.out.println(fname+" "+"("+ email +")");
		}
		readFile.close();

	}

}
