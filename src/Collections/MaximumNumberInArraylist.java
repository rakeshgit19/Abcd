package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumNumberInArraylist {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		
		Integer i = new Integer(Collections.max(list));
		System.out.println(i);

	}

}
