package demo1;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abc";
		String str1=str;
		String str2=new String("abc");
		System.out.println("Str:"+str);
		System.out.println("Str1:"+str1);
		System.out.println("Str2:"+str2);
		System.out.println("Comparing using ==");
		System.out.println(str==str1);
		System.out.println(str1==str2);
		System.out.println(str==str2);
		System.out.println("Comparing using .equals()");
		System.out.println(str.equals(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str.equals(str2));
		
	}

}
