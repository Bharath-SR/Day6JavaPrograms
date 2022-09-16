/**
 * 
 */
package com.bridgeLabz;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Driving Class
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number:");
		int number = input.nextInt();
		
		boolean isPrime = true;
		for (int i = 1; i < number / 2; i++) {
			if (number % 2 == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true)
			System.out.println(number+ " is a Prime Number");
		else
			System.out.println(number+ " is not a Prime Number");
	}

}
