package Collections;

import java.util.Arrays;
import java.util.Collections;

public class SortingArrayInDescendingOrder {

	public static void main(String[] args) 
	{
		Integer[] i = {22,10,28,68,87,8};
		Arrays.sort(i,Collections.reverseOrder());
		for(Integer in:i)
		{
			 System.out.println(in);
		}

	}

}
