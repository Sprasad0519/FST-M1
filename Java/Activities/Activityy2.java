package helloo;

import java.util.Arrays;

public class Activityy2 
{

	public static void main(String Args[])
	{
		int [] arrNumber = {10,77,10,54,-11,10};
		
		System.out.println("Original Array of Number " + Arrays.toString(arrNumber));
		
		int temp =0 ;
		int search_number =10;
		int fixedSum = 30;
		
		for(int i=0;i<=arrNumber.length-1 ;i++)
		{
			if(arrNumber[i]==10)
			{
				temp = temp + search_number;
				
			}
		}
		
		if(temp < fixedSum)
		{
		 System.out.println("True");
		}
		else
		{
			System.out.println("Flase");
		}
		
	}
}
