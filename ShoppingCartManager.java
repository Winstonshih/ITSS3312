package demo1;
import java.util.*;
public class ShoppingCartManager {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
      System.out.println("Enter Customer's Name:");
      String name=input.nextLine();
      System.out.println("Enter Today's Date:");
      String date=input.nextLine();
      System.out.println("");
      System.out.println("Customer Name: "+name);
      System.out.println("Today's Date: "+date);
      ShoppingCart cust1 = new ShoppingCart(name, date);
      System.out.println("");
      printMenu();
      char choice = input.next().charAt(0);
      System.out.println("Choose an option:");
      while (choice!='q')
      {
         if(choice=='a'  ||choice=='d'||choice=='c'||choice=='i'||choice=='o')
         {
            executeMenu(choice, cust1, input);
            printMenu();
         }
         System.out.println("Choose an option:");
         choice = input.next().charAt(0);
      }
	}
   public static void printMenu()
   {
      System.out.println("MENU");
      System.out.println("a - Add item to cart");
      System.out.println("d - Remove item from cart");
      System.out.println("c - Change item quantity");
      System.out.println("i - Output items' descriptions");
      System.out.println("o - Output shopping cart");
      System.out.println("q - Quit\n");
   }
   public static void executeMenu(char customerChoice, ShoppingCart shoppingCart, Scanner scnr)
   {
      if(customerChoice=='o')
      {
         System.out.println("OUTPUT SHOPPING CART");
         shoppingCart.printTotal();
      }
      else if(customerChoice=='i')
      {
         System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
         shoppingCart.printDescriptions();
         System.out.println("");
      }
      else if(customerChoice=='a')
      {
         ItemToPurchase iTP = new ItemToPurchase();
         System.out.println("ADD ITEM TO CART");
         System.out.println("Enter the item name:");
         scnr.nextLine();
         String name=scnr.nextLine();
         iTP.setName(name);
         System.out.println("Enter the item description:");
         String description=scnr.nextLine();
         iTP.setDescription(description);
         System.out.println("Enter the item price:");
         int price=scnr.nextInt();
         iTP.setPrice(price);
         System.out.println("Enter the item quantity:");
         System.out.println("");
         int quantity=scnr.nextInt();
         iTP.setQuantity(quantity);
         shoppingCart.addItem(iTP);
      }
      else if(customerChoice=='d')
      {
         scnr.nextLine();
         System.out.println("REMOVE ITEM FROM CART");
         System.out.println("Enter name of item to remove:");
         String item=scnr.nextLine();
         shoppingCart.removeItem(item);
         System.out.println("");
      }
      else if(customerChoice=='c')
      {
         scnr.nextLine();
         System.out.println("CHANGE ITEM QUANTITY");
         ItemToPurchase changeItem = new ItemToPurchase();
         System.out.println("Enter the item name:");
         String newName=scnr.nextLine();
         changeItem.setName(newName);
         System.out.println("Enter the new quantity:");
         int newQuantity=scnr.nextInt();
         changeItem.setQuantity(newQuantity);
         shoppingCart.modifyItem(changeItem);
      }
   }
}