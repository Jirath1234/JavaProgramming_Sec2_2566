import javax.swing.*;
import java.util.Random;

public class Withdrawal {

	public static void main(String[] args) {
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9) * 100000;
		//JOptionPane.showMessageDialog(null, "You balance: " + balance + "\n Input money to withdraw");
		int withdraw = Integer.parseInt(JOptionPane.showInputDialog("You balance: " + balance + "\nInput money to withdraw:"));
		//JOptionPane.showInputDialog("You balance: " + balance + "\nInput money to withdraw:");
		
		if (withdraw > 20000) {
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw more than 20,000", "ERROR" ,JOptionPane.ERROR_MESSAGE);
		}
		else if (withdraw > balance) {
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw more than balance", "ERROR" ,JOptionPane.ERROR_MESSAGE);
		}
		else if (withdraw % 100 != 0) {
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw " + withdraw % 100 + " baht." , "ERROR" ,JOptionPane.ERROR_MESSAGE);
		}
		int b1000 = withdraw/1000;
		int b500 = withdraw%1000/500;
		int b100 = withdraw%1000%500/100;
		
		JOptionPane.showMessageDialog(null, "You withdraw "+withdraw+"\n1000 = "+ b1000 + "\n500 = " + b500 + "\n100 = " + b100);
	}
}
