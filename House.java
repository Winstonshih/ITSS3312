package demo1;

public class House extends Home implements Tax, Asset{
	private double taxes;
	private double appreciation;
	private double appraisedValue;
	public House(double sqft, int numBedrooms, double schoolRating, double appraisedValue)
	{
		this.sqft=sqft;
		this.schoolRating=schoolRating;
		this.appraisedValue=appraisedValue;
		setAppreciation();
		setTaxes();
		setScore();
	}
	@Override
	public void setAppreciation()
	{
		appreciation=appraisedValue*APPREC_RATE;
	}
	@Override 
	public void setTaxes()
	{
		taxes = appraisedValue*TAX_RATE;
	}
	@Override
	public void setScore()
	{
		score=sqft+(numBedrooms*500)+(schoolRating*300)+appreciation-taxes;
	}
}
