package youDoIt;

import java.util.Scanner;

public class ArithmeticDemo3 {

	public static void main(String[] args) {
		// Variables
		int firstNumber;
		int secondNumber;
		int sum;
		int difference;
		double average;
		
		Scanner input = new Scanner(System.in);
		
		// Input
		System.out.print("Please enter an integer >> ");
		firstNumber = input.nextInt();
		System.out.print("Please enter another integer >> ");
		secondNumber = input.nextInt();
		
		// Math
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		average = sum / 2.0;
		
		//Output
		System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
		System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
		System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
		

	}

}
