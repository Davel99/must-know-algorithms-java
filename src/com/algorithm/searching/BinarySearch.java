package com.algorithm.searching;

import com.algorithm.utility.Utility;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { -4, 5, 10, 12, 13, 50, 111, 120};
		int search = -4;
		int response = BinarySearch.binarySearch(arr, search);
		String message = "";
		if(response == -1) message = search + " not found";
		else message = search + " was found in index " + response;
		System.out.println(message);
		
		Utility.printArray(arr);
	}
	
	public static int binarySearch(int[] arr, int x) {
		int low = 0;
		int high = arr.length -1;
		int mid;
		
		while (low <= high) {
			mid = low + (high - low)/2;
			if(arr[mid] == x) return mid;
			if(arr[mid] < x) low = mid + 1;
			else high = mid -1;
		}
		return -1;
	}

}
