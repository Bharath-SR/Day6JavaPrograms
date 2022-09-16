/**
 * 
 */
package com.bridgeLabz;

/**
 * @author Admin
 *
 */
public class CouponNum {

	/**
	 * Coupon Numbers Problem
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] chars = "fyr2qydftyflmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWYT%#&%2hdXYZ123456789".toCharArray();

		int max = 100000000;
		int random = (int) (Math.random() * max);

		StringBuilder sb = new StringBuilder();

		while (random > 0) {
			sb.append(chars[random % chars.length]);
			random /= chars.length;
		}

		String couponCode = sb.toString();
		System.out.println("Coupon Code: " + couponCode);

	}

}
