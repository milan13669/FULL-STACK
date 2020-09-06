
public class Circle {
    private double radius;
    private String color;
	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	public Circle() {
		
		this(3.5,"Blue");
	}
	
	public Circle(double radius)
	{
		this(radius,"Brown");
	}
	public Circle(String colour)
	{
		this(8.5,colour);
	}
    
    
}
