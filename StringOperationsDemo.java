package demo1;
import java.util.Scanner;
public class StringOperationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userEmail;
		String atSign="@";
		System.out.println("Please input an email addr.");
		Scanner scnr=new Scanner(System.in);
		userEmail=scnr.nextLine();
		System.out.println("The length of your input is "+userEmail.length());
		int atIndex=userEmail.indexOf(atSign);
		if(atIndex==-1)
		{
			System.out.println("Your input is not a valid email address, please try again");
		}
		else
		{
			System.out.println("The input of @ is "+atIndex);
			System.out.println("The username of the email is "+userEmail.substring(0,atIndex));
			System.out.println("The domain is "+userEmail.substring(atIndex+1));
			String safeAddr=userEmail.replace('@', '#').replace(".", " dot ");
			System.out.println("The web safe email addr is "+safeAddr);
		}
	}

}
