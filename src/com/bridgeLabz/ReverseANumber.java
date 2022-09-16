/**
 * 
 */
package com.bridgeLabz;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class ReverseANumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Driving Class
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number:");
		int number = input.nextInt();

		int reverse = 0;

		while (number != 0) {
			int reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println("Reversed number is :" + reverse);

	}

}
