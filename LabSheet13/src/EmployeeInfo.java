import java.util.*;
import java.io.*;
public class EmployeeInfo {
	public static void main(String[] args) throws IOException {
		//create object for input data from keyboard(console)
		Scanner scan = new Scanner(System.in);
		String choice,department;
		System.out.print("Insert or Read data?:");
		choice = scan.next().toLowerCase();
		while(!(choice.equals("insert")) && !(choice.equals("read"))) {
			System.out.print("Please type insert or read data,again:");
			choice = scan.next().toLowerCase();
		}
		
		//create object : call all method in Class SaveandOpen
		SaveandOpen obj = new SaveandOpen();
		if(choice.equals("insert")) {
			obj.insert(); //call insert method from Class SaveandOpen
			
		}
		else if(choice.equals("read")) {
			System.out.print("\nEnter department:");
			department = scan.next();
			obj.setDept(department); //sent department to setDept() method from Class Employee
			obj.read(); //call read() method from Class SaveandOpen
		}
	}

}
