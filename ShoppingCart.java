package demo1;
import java.util.*;
public class ShoppingCart {
	private String customerName;
	private String currentDate;
	private ArrayList<ItemToPurchase> cartItems=new ArrayList<ItemToPurchase>();
	int i;
	ShoppingCart()
	{
		this.customerName="none";
		this.currentDate="January 1, 2016";
	}
	ShoppingCart(String name, String date)
	{
		this.customerName=name;
		this.currentDate=date;
	}
	public String getCustomerName()
	{
		return this.customerName;
	}
	public String getDate()
	{
		return this.currentDate;
	}
	public void addItem(ItemToPurchase itemToAdd)
	{
		cartItems.add(itemToAdd);
	}
	public void removeItem(String itemToRemove)
	{
	   int num=0;
		for(i=0;i<cartItems.size();i++)
		{
			if(cartItems.get(i).getName().equals(itemToRemove))
			{
				cartItems.remove(i);
				num++;
			}
		}
		if(num==0)
		{
			System.out.println("Item not found in cart. Nothing removed.");
		}
	}
	public void modifyItem(ItemToPurchase itemToModify)
	{
	   boolean flag=false;
		for(i=0; i<cartItems.size();i++)
		{
			if(cartItems.get(i).getName().equals(itemToModify.getName()))
			{
				if(cartItems.get(i).getDescription().equals("none"))
				{
					cartItems.get(i).setDescription(itemToModify.getDescription());
					flag=true;
				}
				if(!(itemToModify.getPrice()==0))
				{
					cartItems.get(i).setPrice(itemToModify.getPrice());
					flag=true;
				}
				if(!(itemToModify.getQuantity()==0))
				{
					cartItems.get(i).setQuantity(itemToModify.getQuantity());
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Item not found in cart. Nothing modified.");
			System.out.println("");
		}
	}
	
	public int getNumItemsInCart()
	{
	   int numItems=0;
		for(i=0;i<cartItems.size();++i)
		{
			numItems= numItems+cartItems.get(i).getQuantity();
		}
		return numItems;
	}	
	public int getCostOfCart()
	{
	   int totalCost=0;
		for(i=0;i<cartItems.size();++i)
		{
			totalCost=totalCost+cartItems.get(i).getPrice()*cartItems.get(i).getQuantity();
		}
		return totalCost;
	}
	public void printTotal()
	{
		System.out.println(customerName+"'s Shopping Cart - "+currentDate);
		System.out.println("Number of Items: "+getNumItemsInCart());
		System.out.println("");
		if(getNumItemsInCart()==0)
		{
		   System.out.println("SHOPPING CART IS EMPTY");
		}
		for(i=0;i<cartItems.size();++i)
		{
			cartItems.get(i).printItemCost();
		}
		System.out.println("");
		System.out.println("Total: $"+getCostOfCart());
		System.out.println("");
	}
	public void printDescriptions()
	{
		System.out.println(customerName+"'s Shopping Cart - "+currentDate);
		System.out.println();
		System.out.println("Item Descriptions");
		for(i=0;i<cartItems.size();++i)
		{
			cartItems.get(i).printItemDescription();
		}
	}
}