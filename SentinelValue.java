package demo1;
import java.util.Scanner;
public class SentinelValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		int currentValue;
		int sum;
		int numValues;
		System.out.println("Please input positive values, and end your input with 0");
		currentValue=1;
		numValues=0;
		sum=0;
		while(currentValue>0)
		{
			currentValue=scnr.nextInt();
			numValues+=1;
			sum+=currentValue;
		}
		System.out.println("Their sum is "+sum+", and their mean is "+(double)sum/(numValues-1));
		scnr.close();
	}

}
