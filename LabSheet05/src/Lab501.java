import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full name: ");
		String fullName = scan.nextLine();
		int countSpace = fullName.indexOf(" ");
		if (countSpace == -1) {
			System.out.println("Incorect Name");
		} else {
			String firstName = fullName.substring(0,countSpace);
			String lastName = fullName.substring(countSpace+1);
			System.out.println("First Name: " + firstName.toUpperCase());
			System.out.println("Last Name: " + lastName.toLowerCase());
		}
	}

}
