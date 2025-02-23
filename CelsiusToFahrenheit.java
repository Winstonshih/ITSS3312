package demo1;
import java.util.*;
public class CelsiusToFahrenheit {
	public static double celsiusToFahrenheit(double tempinC)
	{
		double tempinF;
		tempinF=tempinC*9/5+32;
		return tempinF;
	}
	public static void main(String[] args) {
		Scanner scnr= new Scanner(System.in);
		double tempF;
		double tempC;
		System.out.println("Enter temperature in Celsius: ");
		tempC=scnr.nextDouble();
		tempF=celsiusToFahrenheit(tempC);
		System.out.print("Fahrenheit: ");
		System.out.print(tempF);
		// TODO Auto-generated method stub

	}

}
