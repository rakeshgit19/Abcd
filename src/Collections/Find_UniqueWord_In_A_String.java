package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Find_UniqueWord_In_A_String 
{

	public static void main(String[] args) 
	{
		String[] str = "rakesh rakesh kumar dalai".split(" ");
       
        ArrayList<String> l = new ArrayList<>(Arrays.asList(str));
        for(String s:l)  
        {
            if(Collections.frequency(l,s)==1)
            {
                System.out.print(s);
            }
        }  

	}

}
