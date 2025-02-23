package demo1;
import java.util.*;
public class MethodArrayDemo {

	public static int add(int a, int b)
	{
		return a+b;
	}
	public static void reverseVals(int[] arrVals) {
		int i;
		int tempValue;
		//int[] newArray= {1,3,3,4};
		for(i=0;i<(arrVals.length/2);++i)
		{
			tempValue=arrVals[i];
			arrVals[i]=arrVals[arrVals.length-1-i];
			arrVals[arrVals.length-1-i]=tempValue;
		}
		//arrVals=newArray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=15;
		int y=20;
		System.out.println(add(x, y));
		System.out.println(x);
		System.out.println(y);
		//Scanner scnr=new Scanner(System.in);
		//final int NUM_VALUES=8;
		//int[] userVals=new int[NUM_VALUES];
	}

}
