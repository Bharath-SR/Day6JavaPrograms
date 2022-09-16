/**
 * 
 */
package com.bridgeLabz;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Driving Class
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number fibonacci series: ");
		int number = input.nextInt();

		int sum = 0;
		int number1 = 0, number2 = 1;

		System.out.print(number1 + " " + number2 + " ");

		while (sum <= number) {
			sum = number1 + number2;
			if (sum >= number)
				break;
			System.out.print(sum + " ");
			number1 = number2;
			number2 = sum;

	}

	}}
