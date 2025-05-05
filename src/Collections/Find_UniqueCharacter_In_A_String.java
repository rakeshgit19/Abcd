package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Find_UniqueCharacter_In_A_String 
{

	public static void main(String[] args) 
	{
		
		String s = "rrraakkesshp kumar";
		for (int i = 0; i < s.length(); i++)
	    {
	        int flag = 0;
	        
	        for (int j = 0; j < s.length(); j++)
	        {
	            if (s.charAt(i) == s.charAt(j) && i != j) 
	            {
	                flag = 1;
	            }
	        }
	        if (flag == 0)
	        {
	        	System.out.print(s.charAt(i));
	        }
	            
	    }
    }
 
   
}


