import java.util.Scanner;
import java.io.*;
public class Lab1205 {
	public static void main(String[] args) throws IOException {
		Scanner readFile = new Scanner(new File("d://txtFile//student.txt"));
		int i = 1;
		Header();
		while(readFile.hasNext()) {
			String id = readFile.next();
			
			readFile.next();
			String fname = readFile.next();
			String lname = readFile.next();
			String name = fname.substring(0,1).toUpperCase()+"."+lname;
			double grade = Double.parseDouble(readFile.next());
			readFile.next();
			System.out.println(i+"."+"\t"+id+"\t"+Level(id)+"\t"+name+"\t"+grade+"\t"+Status(grade));
			i++;
		}
		readFile.close();
	}

	public static String Level(String id) {
		int year = 22 - Integer.parseInt(id.substring(0,2));
		return Integer.toString(year)+"th";
	}
	
	public static String Status(double grade) {
		if (grade >= 2.00) {
			return "Pass";
		}
		else if (grade < 2.00 && grade >= 1.0){
			return "Critical";
		}
		else {
			return "Retired";
		}
	}
	public static void Header() {
		System.out.println("NO.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("*********************************************************************");
	}
}
