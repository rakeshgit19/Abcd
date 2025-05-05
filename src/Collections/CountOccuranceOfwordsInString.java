package Collections;

import java.util.HashMap;

public class CountOccuranceOfwordsInString 
{

	static int count;
	public static void main(String[] args) 
	{
		String[] s = "Rskesh kumar dalai dalai kumar studying".split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String str:s)
		{
			if (map.containsKey(str)) 
			{
			
				count = map.get(str);
				map.put(str, count+1);
				
			}
			else {
				map.put(str, 1);
			}
			
			
		}
		System.out.println(map);

	}

}
