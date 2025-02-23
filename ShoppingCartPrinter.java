package demo1;
import java.util.Scanner;
public class ShoppingCartPrinter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ItemToPurchase i1=new ItemToPurchase();
		System.out.println("Item 1");
		System.out.println("Enter the item name:");
		String itemOneName=input.nextLine();
		i1.setName(itemOneName);
		System.out.println("Enter the item price:");
		int itemOnePrice=input.nextInt();
		i1.setPrice(itemOnePrice);
		System.out.println("Enter the item quantity:");
		int itemOneQuantity=input.nextInt();
		i1.setQuantity(itemOneQuantity);
		input.nextLine();
		ItemToPurchase i2=new ItemToPurchase();
		System.out.println("\nItem 2");
		System.out.println("Enter the item name:");
		String itemTwoName=input.nextLine();
		i2.setName(itemTwoName);
		System.out.println("Enter the item price");
		int itemTwoPrice=input.nextInt();
		i2.setPrice(itemTwoPrice);
		System.out.println("Enter the item quantity:");
		int itemTwoQuantity=input.nextInt();
		i2.setQuantity(itemTwoQuantity);
		input.close();
		System.out.println();
		System.out.println("TOTAL COST");
	   	i1.printItemToPurchase();
	   	i2.printItemToPurchase();
	   	System.out.println();
	   	System.out.println("Total: $" + ((i1.getPrice() * i1.getQuantity()) + (i2.getPrice() * i2.getQuantity())));
	}
}
