import java.util.*;
public class Example1 {
	public static void main(String[] args) {
		//create object for input data from console(keyboard)
		Scanner scan = new Scanner(System.in);
		int currentNumber , previousNumber;
		
		System.out.print("Input number : ");
		previousNumber = scan.nextInt();
		
		System.out.print("Input number : ");
		currentNumber = scan.nextInt();
		
		while(true) {
			System.out.print("Input number : ");
			currentNumber = scan.nextInt();
			if(currentNumber < previousNumber) {
				break;
			}
			previousNumber = currentNumber;
		}
		System.out.print("\nBye Bye");
		
		//ถ้าตัวเลขตัวแรกน้อยกว่าตัวเลขตัวที่สอง ให้แสดงข้อความว่า "Bye Bye"
		/*if(currentNumber < previousNumber) {
			System.out.print("Bye Bye");
		}*/
	}

}
