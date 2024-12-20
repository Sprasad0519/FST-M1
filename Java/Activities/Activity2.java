package helloo;

import java.util.Arrays;

public class Activity2 {
	

	public static void main(String[] args) {
		int[] arrNum = {10,77,10,54,-11,10};
		System.out.println("Original Array:" + Arrays.toString(arrNum));
		
		//Seting the constanat
		
		int SerachNum = 10;
		int fixedSum = 30;
		
		//Print Result 
		System.out.println("Result:" + result(arrNum,SerachNum,fixedSum));
		
		
	}

	private static boolean result(int[]numbers, int serachNum, int fixedSum) {
		int temp_sum=0;
		
		//Loop through array
		
		for(int number : numbers)
		{
			
			if(number==serachNum)
			{
				
				temp_sum+=serachNum;
		}
		
		if(temp_sum>fixedSum){
			break;
		}
	}
	
	
		return temp_sum==fixedSum;
		
	}

}
