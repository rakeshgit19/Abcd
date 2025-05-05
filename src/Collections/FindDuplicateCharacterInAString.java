package Collections;

import java.util.HashSet;

public class FindDuplicateCharacterInAString 
{

	public static void main(String[] args) 
	{
		String s = "rrraakkessh";
		char[] ch = s.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		
		for(Character c:ch)
		{
			if (set.add(c)==false) 
			{
				System.out.println(c);
			}
		}

	}

}
