package demo1;

public class Circle {
	public double radius;
	public final static double PI=3.14;
	Circle()
	{
		this(0.0);
	}
	Circle(double newRadius)
	{
		radius=newRadius;
	}
	Circle(int newRadius)
	{
		radius=100;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public double demo()
	{
		return 1.0;
	}
	public double getDiameter()
	{
		return radius*2;
	}
	public static double getDiameter(double myRadius)
	{
		return myRadius*2;
	}
	public static double getCircumference(double myRadius)
	{
		return 2*PI*myRadius;
	}
	public String toString()
	{
		return "Circle \n Radius"+this.radius;
	}
}
