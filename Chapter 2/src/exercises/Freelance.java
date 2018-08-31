package exercises;

import java.util.Scanner;

public class Freelance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int total;
		String yourName;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		num1 = input.nextInt();
		System.out.println("Enter another number:");
		num2 = input.nextInt();
		System.out.println("Enter your name:");
		yourName = input.next();
		
		System.out.println("Thank you, " + yourName);
		System.out.println("The numbers add up to " + (num1 + num2));

	}

}
