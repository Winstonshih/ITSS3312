package demo1;

public class ItemToPurchase {
	private String itemName;
	private int itemPrice;
	private int itemQuantity;
	private String itemDescription;
	ItemToPurchase()
	{
		this("none", "none", 0, 0);
	}
	ItemToPurchase(String name, String description, int price, int quantity)
	{
		this.itemName=name;
		this.itemDescription=description;
		this.itemPrice=price;
		this.itemQuantity=quantity;
	}
	public void setName(String name)
	{
		this.itemName=name;
	}
	public String getName()
	{
		return this.itemName;
	}
	public void setDescription(String description)
	{
		this.itemDescription=description;
	}
	public String getDescription()
	{
		return this.itemDescription;
	}
	public void setPrice(int price)
	{
		this.itemPrice=price;
	}
	public int getPrice()
	{
		return this.itemPrice;
	}
	public void setQuantity(int quantity)
	{
		this.itemQuantity=quantity;
	}
	public int getQuantity()
	{
		return this.itemQuantity;
	}
	public void printItemCost()
	{
		System.out.println(itemName+" "+itemQuantity+" @ $"+itemPrice+" = $"+(itemPrice*itemQuantity));
	}
	public void printItemToPurchase()
	{
		System.out.println(itemName+" "+itemQuantity+" @ $"+itemPrice+" = $"+(itemPrice*itemQuantity));
	}
	public void printItemDescription()
	{
		System.out.println(itemName+": "+itemDescription);
	}
}
