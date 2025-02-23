package demo1;
import java.util.*;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wage;
		Scanner scnr=new Scanner(System.in);
		wage=scnr.nextInt();
		scnr.close();
		System.out.print("Your wage is ");
		System.out.println(wage * 40 * 52);
		System.out.print("Another print");
	}

}
