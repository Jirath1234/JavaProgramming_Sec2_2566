public class Circle {
	//The public constants
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
	
	//The private 2 attributes
	private double radius;
	private String color;
	
	//Constructs a Circle with default radius and color
	//1st(default) Constructor
	Circle(){
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}
	//Constructs a Circle with the given radius and default color
	//2nd Constructor
	Circle(double radius) {
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}
	//Constructs Circle with the given radius and color
	//3rd Constructor
	Circle(double radius,String color) {
			this.radius = radius;
			this.color = color;
	}
	//Returns the radius-the public getter for private attribute radius
	public double getRadius() {
		return this.radius;
	}
	//Set the radius-the public getter for private attribute radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//Returns the color-the public getter for private attribute color
	public String getcolor() {
		return this.color;
	}
	//Set the color-the public setter for private attribute color
	public void setColor(String color) {
		this.color = color;
	}
	//Return a self-descriptive string for a Circle
	public String toString() {
		return "Circle[radius = "+this.radius+", color = "+color+"]";
	}
	//Return the area of this Circle
	public double getArea() {
		return Math.PI * Math.pow(radius,2);
		//return Math.PI * radius * radius;
	}
	
	//Return the circumference (เส้นรอบวง) of this Circle
	public double getCircumference() {
		return 2.0 * Math.PI * radius;
	}
}
