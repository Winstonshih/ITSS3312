package demo1;
import java.util.Scanner;

public class ShippingCost {
	public static double calcTax(double shippingCost){
		return shippingCost*(1+(6.25/100));
	}
	public static double calcShippingCost(double weight) {
		double cost;
		if(weight<1)
		{
			cost=7.88;
		}
		else if(weight<6)
		{
			cost=14.32;
		}
		else if(weight<10)
		{
			cost=21.11;
		}
		else {
			cost=25.5;
		}
		cost+=calcTax(cost);
		return cost;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		double weightOfPackage;
		System.out.print("Enter packcage weight: ");
		weightOfPackage=scnr.nextDouble();
		scnr.close();
		System.out.printf("%.2f", calcShippingCost(weightOfPackage));
		System.out.println("");
	}

}
