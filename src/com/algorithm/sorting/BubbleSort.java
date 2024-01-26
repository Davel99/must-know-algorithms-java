package com.algorithm.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5,10,1,3};
		BubbleSort.bubbleSort(arr,true);
		BubbleSort.printArray(arr);
	}
	
	public static void bubbleSort(int[] arr, boolean asc) {
		int len = arr.length;
		int temp, i, j, max;
		boolean sorted = false;
		// Go from 0 to the penultimate index of the array
		for(i = 0; i < len -1; i++) {
			sorted = false;
			max = len -i -1;
			for(j = 0; j < max; j++) {
				boolean result = false;
				if(asc) result = arr[j] > arr[j+1];					
				else result = arr[j] < arr[j+1];					
				if(result) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					sorted = true;
				}	
			}
			if(!sorted) break;
		}
		
	}
	
	public static void printArray(int[] arr) {
		String message = "";
		for(int i = 0; i < arr.length; i++) {
			message += arr[i] + ", ";
		}
		System.out.println(message);		
	}

}
