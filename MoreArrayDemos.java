package demo1;

public class MoreArrayDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray= {8,13,16,7,5,1,0,55};
		int min=myArray[0];
		int i;
		for(i=0;i<myArray.length;++i)
		{
			if(myArray[i]<min)
			{
				min=myArray[i];
			}
		}
		System.out.println("Minimum is "+min);
		int count=0;
		for(i=0;i<myArray.length;++i)
		{
			if(myArray[i]%2==1)
			{
				++count;
			}
		}
		System.out.println("Count: "+count);
		int[] secondArray;
		//int[] secondArray= {-8,-13,-16,-7,-5,1,0,55};
		//for(i=0;i<secondArray.length;++i)
		//{
		//	if(secondArray[i]<0)
		//	{
		//		secondArray[i]+=-1;
		//	}
		//}
		//for(i=0;i<secondArray.length;++i)
		//{
		//	System.out.println(secondArray[i]+" ");
		//}
		secondArray=myArray;
		System.out.println(secondArray[secondArray.length-1]);
		secondArray[secondArray.length-1]=100;
		System.out.println(secondArray[secondArray.length-1]);
	}

}
