import java.util.*;
public class BookDemo {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Input book title   :");
		String booktitle = scan.next();
		System.out.print("Input book price   :");
		float bookprice = scan.nextFloat();
		System.out.print("Input publish year :");
		int publishyear = scan.nextInt();
		
		Book book = new Book();
		book.setTitle(booktitle);
		book.setPrice(bookprice);
		book.setPublishyear(publishyear);
		
		System.out.println(book.toString());

	}

}
