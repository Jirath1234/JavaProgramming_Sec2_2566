public class TestCustomer {

	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		 Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		System.out.println(c1);
		c1.setDiscount(5);
		System.out.println(c1);
		
		Line();
		System.out.println("ID is : "+c1.getID());
		System.out.println("Name is : "+c1.getName());
		System.out.println("discount is : "+c1.getDiscount());
		
		Line();
		System.out.println("###Test Invoice class###");
		Invoice invl = new Invoice(101, c1, 12000.00);
		System.out.println(invl);
		invl.setAmount(10000);
		System.out.println(invl);
		
		Line();
		System.out.println("ID is : "+invl.getID());
		System.out.println("Customer is : "+invl.getcustomer());
		System.out.println("Amount is : "+invl.getAmount());
		
		Line();
		System.out.println("Customer's id is : "+invl.getCustomerID());
		System.out.println("Customer's name is : "+invl.getCustomerName());
		System.out.println("Customer's discount is : "+invl.getCustomerDiscount());
		System.out.println("Amount after discount is : "+invl.getAmountAfterDiscount());
	}

	public static void Line() {
		System.out.println("*".repeat(88));
	}


}

