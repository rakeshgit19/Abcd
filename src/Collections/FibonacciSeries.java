package Collections;

import java.util.Iterator;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int a=0; int b=0;int c=1;int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any nymber");
		num = scan.nextInt();
		
		for (int i = 0; i<=num; i++) 
		{
		
			a=b;
			b=c;
			c=a+b;
			
			System.out.println(a);
			
		}
		

	}

}
