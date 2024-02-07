import java.util.Scanner;
import java.io.*;
public class Lab1201 {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(new File("D://txtfile//MemberLogin.txt"));
		while(read.hasNext()) {
			String fname = read.next();
			String lname = read.next();
			read.next();
			String email = read.next().toUpperCase();
			String mname = lname.substring(0,1).toUpperCase()+"."+fname;
			System.out.println(mname+" ("+email+")");
		}
		read.close();
	}

}