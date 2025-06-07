package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class UniqueWord_In_String 
{

	public static void main(String[] args) 
	{ 
		String[] s = "rakesh rakesh kumar dalai".split(" ");
		HashMap<String, Integer> map =  new HashMap<String, Integer>();
        int count;
    for (String word : s) 
    {
        // If the word is present in array then
     
        if (map.containsKey(word)) 
        {
        	count = map.get(word);
            map.put(word,  count+1);
        }

        // Else store the word inside map
        // with value one
        else
            map.put(word, 1);
    }

    // Iterate over the map using for each loop
    for (Entry<String, Integer> entry :map.entrySet()) 
         
    {

        // If value of words equals unity 
        if (entry.getValue() == 1)

            System.out.println(entry.getKey());
    }

	}

}
