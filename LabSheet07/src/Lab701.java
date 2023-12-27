import java.util.Scanner;

public class Lab701 {

	public static void main(String[] args) {
		int[] nums = new int [7];
		int countOdd = 0;
		int i = 0;
		Scanner scan = new Scanner(System.in);
		for (int _nums:nums) {
			System.out.print("Input number " + (i+1) + " : ");
			nums[i] = scan.nextInt();
		if (nums[i] % 2 != 0) {
			countOdd++;
		}
		i++;
		}
		System.out.println();
		System.out.println("There are " + countOdd + " of odd number.");
		System.out.print("List of odd number : ");
		for(int _nums:nums) {
			if(_nums %2 !=0 ) {
				System.out.print(_nums + " ");
			}
		}
	}

}