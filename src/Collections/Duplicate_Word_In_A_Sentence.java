package Collections;

import java.util.HashSet;

public class Duplicate_Word_In_A_Sentence 
{

	public static void main(String[] args) 
	{
		String[] s = "rakesh rakesh rakesh kumar dalai".split(" ");
		HashSet<String> set = new HashSet<String>();
		
		for(String str:s)
		{
			if (set.add(str)==false) 
			{
			
				System.out.println(str);
			}
		}

	}

}
