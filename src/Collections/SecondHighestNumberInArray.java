package Collections;

import java.util.Arrays;

public class SecondHighestNumberInArray 
{

	public static void main(String[] args) 
	{
		  int[] i= {10, 20, 25, 63, 96, 57};
		  int size = i.length;
	      Arrays.sort(i);
	      
	      //System.out.println("sorted Array ::"+Arrays.toString(i));
	      
	      //So here in i[size-2] formula if we place 1,it will give highest number and if we put 2 it will give 2nd highst number 
	      //and if we put 3 it will give 3rd highest number so on...
	      
	      int result = i[size-2]; 
	      System.out.println("2nd largest Number is ::"+result);

	}

}
