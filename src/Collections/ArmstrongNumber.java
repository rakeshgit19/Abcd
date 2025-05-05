package Collections;

import java.util.Scanner;

public class ArmstrongNumber 
{

	public static void main(String[] args) 
	{
		int sum =0; int num; int rem; int n;
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("enter any number");
		 num = scan.nextInt();
		 n=num;
		 
		 while(num>0) 
		 {
		
			 rem = num % 10;
			 num = num/10 ;
			 sum = sum + rem*rem*rem ;
			 
		}
		 if (sum==n) 
		 {
			System.out.println("its an armstrong number");
		}
		 else {
			System.out.println("its not armstrong number");
		}
		 
		 
	}

}
