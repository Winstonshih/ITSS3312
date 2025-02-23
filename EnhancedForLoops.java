package demo1;
import java.util.*;
public class EnhancedForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray= {2, 7, 6, 9, 8};
		int i, temp;
		for(i=0;i<myArray.length/2;++i)
		{
			temp=myArray[i];
			myArray[i]=myArray[myArray.length-1-i];
			myArray[myArray.length-1-i]=temp;
		}
		for(i=0; i<myArray.length;++i)
		{
			System.out.print(myArray[i]+" ");
		}
	}

}
