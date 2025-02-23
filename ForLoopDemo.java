package demo1;
import java.util.*;
public class ForLoopDemo {

	public static void main(String[] args) {
		double initialAmount;
		double interestRate;
		double currentAmount;
		System.out.println("Initial amount");
		Scanner scnr=new Scanner(System.in);
		initialAmount=scnr.nextDouble();
		System.out.println("Interest rate");
		interestRate=scnr.nextDouble();
		int i;
		currentAmount=initialAmount;
		for(i=0; i<10;++i)
		{
			currentAmount=currentAmount+currentAmount*(1+interestRate);
			System.out.println("Current amount is "+currentAmount);
		}
		scnr.close();
	}

}
