package demo1;
import java.util.Scanner;
public class HealthData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner scanner=new Scanner(System.in);
		age=scanner.nextInt();
		int days;
		days=365*age + age/4;
		System.out.println("Your age in days is "+days);
	}

}
