import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y,z;
		System.out.print("Input Value of X : ");
		x = scan.nextInt();
		System.out.print("Input Value of Y : ");
		y = scan.nextInt();
		
		while (y<=x) {
			System.out.print("Input Value of Y, again : ");
			y = scan.nextInt();
		}
		z = x;
		int sum = z+x+1;
		System.out.println(""+z+" "+"+ (x+1)+ ="+sum);
		z = sum;
		x++;
		}
	}

}
