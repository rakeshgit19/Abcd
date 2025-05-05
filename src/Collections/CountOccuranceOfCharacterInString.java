package Collections;

import java.util.HashMap;

public class CountOccuranceOfCharacterInString 
{
	static int count ;
	public static void main(String[] args) 
	{
		String s = "Raaakesshh";
		char[] ch = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character c:ch)
		{
			if (map.containsKey(c)) 
			{
			
				count = map.get(c);
				map.put(c, count+1);
				
			}
			else {
				map.put(c, 1);
			}
			
			System.out.println(map);
		}

	}

}
