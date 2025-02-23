package demo1;

public class Apartment extends Home{
	Apartment(double sqft, int rooms, double rating)
	{
		this.sqft=sqft;
		this.numBedrooms=rooms;
		this.schoolRating=rating;
		setScore();
	}
	
	public void setScore()
	{
		score=sqft+(numBedrooms*500)+(schoolRating*300);
	}
}
