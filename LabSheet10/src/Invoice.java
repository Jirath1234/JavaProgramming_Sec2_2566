public class Invoice {

	private int id;
	private Customer customer;
	private double amount;
	
	Invoice(int id, Customer customer, double amount){
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	
	public int getID() {
		return id;
	}
	
	public Customer getcustomer() {
		return customer;
	}
	
	public void setcustomer(Customer customer) {
		this.customer = customer;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public int getCustomerID() {
		return this.getcustomer().getID();
	}
	
	public String getCustomerName() {
		return this.getcustomer().getName();
	}
	
	public int getCustomerDiscount() {
		return this.getcustomer().getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		return amount-amount*getcustomer().getDiscount()/100;
	}
	
	public String toString() {
		return "Invoice"+"[id= "+getID()+",Customer="+customer+" ,amount= "+getAmountAfterDiscount();
	}
}
