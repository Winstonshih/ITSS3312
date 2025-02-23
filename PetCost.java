package demo1;

public class PetCost {
	private double purchase;
	private double maintenance;
	private int lifespan;
	private double total;
	PetCost(double purchase, double maintenance, int lifespan, double total)
	{
		this.purchase=purchase;
		this.maintenance=maintenance;
		this.lifespan=lifespan;
		this.total=total;
	}
	public void setTotal(double total)
	{
		this.total=total;
	}
	public double getTotal()
	{
		return this.purchase+(this.maintenance*this.lifespan);
	}
	
}
