import javax.swing.*;
public class Lab602 {
	public static void main(String[] args) {
		int inputYear = Integer.parseInt(JOptionPane.showInputDialog("Input year: "));
	
		while(!(checkYear(inputYear))) {
			inputYear = Integer.parseInt(JOptionPane.showInputDialog("Please input year between 1000-3000:"
					+ "\nInput Year, again"));
		}
		if(isLeapYear(inputYear)==true) {
			JOptionPane.showMessageDialog(null, inputYear + "is Leap Year");
		} else {
			JOptionPane.showMessageDialog(null, inputYear + "is not Leap Year");
		}
		
	}//end of main
	
	public static boolean isLeapYear(int year) {
		if((year%4==0)&&((year%100!=0)||(year%400==0))) {
			return true;
		} else {
			return false;
		}
		
	}//end of isLeapYear

	public static boolean checkYear(int year) {
		if(year>=1000 & year <= 3000) {
			return true;
		}else {
			return false;
		}
		
	}//end of checkYear

}
