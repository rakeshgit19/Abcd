package Collections;

import java.util.HashSet;

public class FindDuplicateNumber 
{

	public static void main(String[] args) 
	{
		int[] i = {2,2,3,3,4,5};
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(Integer c :i)
		{
			if (set.add(c)==false) {
				
				System.out.println(c);
			}
					
					
		}  

	}

}
