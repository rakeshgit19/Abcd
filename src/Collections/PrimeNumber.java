package Collections;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int count = 0; int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any number");
		num = scan.nextInt();
		
		if (num%2==0) {
			
			count++ ;
		}
		if (count==0) {
			
			System.out.println("its prime number");
		}
		else {
			
			System.out.println("its not prime number");
		}

	}

}
