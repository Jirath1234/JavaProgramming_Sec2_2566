import javax.swing.*;//import library for input data from Dialog box
import java.text.DecimalFormat;
public class Example1 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final int BUFFET = 299;
		//input and convert data from dialog box 
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customrt per bill?"));
		double discount , totalPrice = 0;
		//Calculate total price of buffet
		totalPrice = BUFFET * numberofCustomer;
		//using showMessage dialog box for display totalPrice
		//JOptionPane.showMessageDialog(null, "Amount to be paid is " + totalPrice + " baht.");
		//using Confirm dialog box
		int memberCard;
		do {
			memberCard = JOptionPane.showConfirmDialog(null, "Total price is " + frm.format(totalPrice) + " baht." +
				"\nDo you have a member card?");
		}while(memberCard==JOptionPane.CANCEL_OPTION);
		
		if(memberCard==JOptionPane.YES_OPTION)
		{
		discount = totalPrice * 90/100;	
		JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(discount) + " baht.");
		}
		else if(memberCard==JOptionPane.NO_OPTION) 
		{
			JOptionPane.showConfirmDialog(null, "Total price is " + frm.format(totalPrice) + " baht.");
		}
	}

}
