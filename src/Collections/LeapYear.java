package Collections;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
	{
	    int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any year");
		num = scan.nextInt();
		
		if (num%4==0) {
			
			System.out.println("its a leap year");
		}
		else {
			System.out.println("its not a leap year");
		}

	}

}
