package Collections;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		 int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any number");
		num = scan.nextInt();
		
		if (num%2==0) {
			
			System.out.println("its an even number");
		}
		else {
			
			System.out.println("its an odd number");
		}

	}

}
