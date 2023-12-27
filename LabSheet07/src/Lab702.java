import java.util.Scanner;
import java.text.*;

public class Lab702 {

	public static void main(String[] args) {
		double[] scores = new double [5];
		double i = 0;
		
		DecimalFormat frm = new DecimalFormat("#.00");
		Scanner scan = new Scanner(System.in);
		
		for(int a = 0;a <scores.length;a++ ) {
			System.out.print("Input score of student " +(a+1)+" : ");
			scores[a] = scan.nextDouble();
			i += scores[a] / scores.length;
		
	}
		
		System.out.println();
		System.out.println("Average of "+ scores.length+ " student is "+ frm.format(i));
		for(int a = 0 ; a < scores.length;a++) {
			if(scores[a] > i) {
				System.out.println("> Student "+ (a+1) + " ("+frm.format(scores[a])+")");
			}
}
}
}
