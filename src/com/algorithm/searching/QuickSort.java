package com.algorithm.searching;

import com.algorithm.utility.Utility;

public class QuickSort {
	
	static boolean asc = false;

	public static void main(String[] args) {
		int[] arr = { 6, -3, 105, -46, 57 };
		
		quickSort(arr, 0, arr.length -1);
		
		Utility.printArray(arr);
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		//Do nothing if array has just one element
		if(start >= end) return;
		
		//Calculate pivot
		int pivot = setPivot(arr, start, end);
		//Sort left and right of the pivot
		quickSort(arr, start, pivot-1);
		quickSort(arr, pivot+1, end);		
	}
	
	public static int setPivot(int[] arr, int start, int end) {
		//Get pivot value
		int pivotValue = arr[end];
		
		//Set utility vars
		int temp;
		int y = start -1;
		//Start the main loop
		while(start <= end) {
			boolean canProceed;
			if(QuickSort.asc) canProceed = arr[start] < pivotValue;
			else canProceed = arr[start] > pivotValue;
			if(canProceed) {
				y++;
				temp = arr[y];
				arr[y] = arr[start];
				arr[start] = temp;
			}
			start++;
		}
		//Setting the pivot point, y + 1
		y++;
		//Swap values between arr[y] and arr[end] (pivot)
		temp = arr[end];
		arr[end] = arr[y];
		arr[y] = temp;
		//Return the pivot position
		return y;		
	}

}
