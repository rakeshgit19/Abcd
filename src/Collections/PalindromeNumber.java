package Collections;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		int num; int sum=0; int rem; int n;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any number");
		num = scan.nextInt();
		n=num;
		
		while(num>0)
		{
			rem = num%10;
			num = num/10;
			sum = sum*10+rem;
		}
		if (sum==n) {
			
			System.out.println("its a palindrom number");
		}
		else {
			System.out.println("its not a palindrom number");
		}

	}

}
