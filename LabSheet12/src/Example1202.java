import java.util.*;
import java.io.*;
public class Example1202 {
	public static void main(String[] args) throws IOException {
		//use scanner class for input data from keyboard
		Scanner input = new Scanner(System.in);
		System.out.print("Input Section: ");
		int sectionInput = input.nextInt();
		Header();
		showListStudent(sectionInput);
	}
	
	public static void showListStudent(int section) throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String tmp = "";
		while((tmp = readFile.readLine())!= null) {
			String[] data = tmp.split("\t");
			int sectionData = Integer.parseInt(data[3]);
			double midtermScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			
			if(sectionData == section) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+midtermScore
						+"\t"+finalScore+"\t"+findResult(midtermScore,finalScore));
			}
			
		}
		readFile.close();
	}
	
	public static String findResult(double midScore,double finScore) {
		double totalScore = midScore + finScore;
		/*if(totalScore <= 40)
			return "Fail";
		else
			return "Pass"; */
		
		return totalScore <= 40? "Fail" : "Pass";
	}
	
	public static void Header() {
		System.out.println("***************************************************************");
		System.out.println("\t\tList of Data for Section ");
		System.out.println("***************************************************************");
	}

}
