package demo1;

public class IntegerCachedValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Range for cache: [-128, 127]
		Integer i1=127;
		Integer i2=127;
		if(i1==i2)
		{
			System.out.println("==works");
		} else if(i1.equals(i2)){
			System.out.println(".equal should work!");
		}
	}

}
