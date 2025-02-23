package demo1;
import java.util.*;
public class RandomNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randGen = new Random();
		System.out.println(randGen.nextInt(10));
		System.out.println(randGen.nextInt(15));
		System.out.println(randGen.nextInt(20));
		System.out.println(randGen.nextInt(10)+1);
	}

}
