
public class TestCircle {
	public static void main(String[] args) {
		// Test all constructs and toString()
		Circle c1 = new Circle(1.1,"blue"); //call 3nd Constructor
		System.out.println(c1);
		System.out.println();
		
		Circle c2 = new Circle(2.2); //call 2nd Constructor
		System.out.println(c2);
		System.out.println();
		
		Circle c3 = new Circle(); //call 1st (default Constructor)
		System.out.println(c3);
		System.out.println();
		
		//Test Setters and Getters
		c1.setRadius(3.3);
		c1.setColor("green");
		System.out.println(c1);
		System.out.println("The radius of c1 is: "+c1.getRadius());
		System.out.println("The color of c1 is: "+c1.getcolor());
		
		//Test getArea() and getCircumference()
		System.out.printf("The area is: %.2f%n",c1.getArea() );
		System.out.printf("The Circumference is: %.3f%n",c1.getCircumference());
	}
}
