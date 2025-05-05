package Collections;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) 
	{
		int n;int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any number");
		number=scan.nextInt();
		n=number;
		
		for (int i = 1; i <= 10; i++) 
		{
		
			System.out.println(+n+ "*" +i+ "=" + n*i) ;
		}
		

	}

}
