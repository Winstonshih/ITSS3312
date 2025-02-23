package demo1;

public class CircleRunner {

	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.radius=10.0;
		System.out.println(c1.getDiameter());
		Circle c2=new Circle(5.0);
		System.out.println(c2.radius);
		System.out.println(c2.getDiameter());
		Circle c3=new Circle(1.0);
		System.out.println(c3.radius);
		System.out.println(c3.getDiameter(c3.radius));
		System.out.println(Circle.PI);
		System.out.println(Circle.getCircumference(c3.radius));
	}

}
