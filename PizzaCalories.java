package demo1;

public class PizzaCalories {
	public static double calcArea(double diameter)
	{
		final double PI=3.1415;
		double area=Math.pow(diameter,2)*PI;
		return area;
	}
	public static double calcCalories(double diameter)
	{
		final double CPI=16.7;
		double calories=CPI*calcArea(diameter);
		return calories;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcCalories(20.0));
	}

}
