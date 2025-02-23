package demo1;

public class LeaseInfo {
	public String apartNum;
	public String leaseName;
	public double rent;
	public double deposit=100;
	public int petCnt;
	private int petFee=5;
	LeaseInfo(String apartNum, String leaseName, double rent, int petCnt)
	{
		this.apartNum=apartNum;
		this.leaseName=leaseName;
		this.rent=rent;
		this.petCnt=petCnt;
	}
	public double firstPayment()
	{
		return deposit+rent+petCnt*petFee;
	}
	public double secondPayment()
	{
		return rent+petCnt*petFee;
	}
	public int getPetFee()
	{
		return this.getPetFee();
	}
	public void setPetFee(int petFee)
	{
		this.petFee=petFee;
	}
}
