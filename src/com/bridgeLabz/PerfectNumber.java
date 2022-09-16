/**
 * 
 */
package com.bridgeLabz;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class PerfectNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Driving Class
		int sum = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int number = input.nextInt();

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == number) {
			System.out.println(number + " Number is perfect");
		} else {
			System.out.println(number + " Number is not perfect");
		}
	}

}
