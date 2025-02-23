package demo1;

public class CountDownTimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countDown(10);
	}
	public static void countDown(int countInt)
	{
		if(countInt<=0)
		{
			System.out.println("GO!");
		}
		else if(countInt==1)
		{
			System.out.println("One second left!");
			countDown(countInt-1);
		}
		else
		{
			countDown(countInt-1);
		}
	}
}
