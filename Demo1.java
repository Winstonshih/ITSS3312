package demo1;
import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner scnr=new Scanner(System.in);
		num1=scnr.nextInt();
		num2=scnr.nextInt();
		if(num2!=0)
		{
			System.out.println(num1/num2);
		}
		System.out.print("Bye");
	}

}
