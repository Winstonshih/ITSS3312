package demo1;

public class PerfectSizeArray {
	public static void fill(int[] arrRef, int val)
	{
		int i;
		for(i=0;i<arrRef.length;++i)
		{
			arrRef[i]=val;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray= new int[10];
		int i;
		for(i=0; i<10;++i)
		{
			System.out.println(myArray[i]);
		}
		fill(myArray,100);
		for(i=0;i<myArray.length;++i)
		{
			System.out.println(myArray[i]);
		}
	}

}
