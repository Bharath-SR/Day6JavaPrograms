/**
 * 
 */
package com.bridgeLabz;

import java.util.concurrent.TimeUnit;

/**
 * @author Admin
 *
 */
public class SimulateStopWatch {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//Driving Class
		long startTime = System.nanoTime();

		TimeUnit.SECONDS.sleep(5);

		long endTime = System.nanoTime();

		long timeElapsed = endTime - startTime;

		System.out.println("Execution time in nanoseconds: " + timeElapsed);
		System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

	}

}
