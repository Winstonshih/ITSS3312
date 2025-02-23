package demo1;
import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int numA;
		int numB;
		numA=scnr.nextInt();
		numB=scnr.nextInt();
		while(numA!=numB)
		{
			if(numA>numB)
			{
				numA-=numB;
			}
			else
			{
				numB-=numA;
			}
		}
		System.out.println("Their GCD is "+numA);
		scnr.close();
	}

}
