package com.algorithm.utility;

public class Utility {
	
	public static void printArray(int[] arr) {
		String message = "Array values: ";
		for(int i = 0; i < arr.length; i++) {
			message += arr[i] + " ";
		}
		System.out.println(message);
	}

}
