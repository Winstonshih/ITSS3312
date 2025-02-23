package demo1;

public class FloatingPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double taxRate=0.085;
		int bookPrice=100;
		double priceAfterTax=bookPrice*(1+taxRate);
		System.out.println("Book price after tax is "+priceAfterTax);
		double totalPrice=34283.342;
		int items=50;
		double avgPrice=totalPrice/items;
		System.out.print("avg price is");
		System.out.printf(" %.2f", avgPrice);
		System.out.println("");
		double reallyLargeNumber=1e20;
		System.out.println(reallyLargeNumber);
	}

}
