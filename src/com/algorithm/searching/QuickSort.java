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
		if(start >= end) return;
		
		int pivot = setPivot(arr, start, end);
		quickSort(arr, start, pivot-1);
		quickSort(arr, pivot+1, end);		
	}
	
	public static int setPivot(int[] arr, int start, int end) {
		//Get pivot value
		int pivotValue = arr[end];
		
		//Set utility vars
		int temp;
		int y = start -1;
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
		y++;
		temp = arr[end];
		arr[end] = arr[y];
		arr[y] = temp;
		
		return y;		
	}
	
//	public static void quickSort(int[] arr, int start, int end) {
//		if(end <= start) return;
//		
//		int pivot = getPivot(arr, start, end);
//		quickSort(arr, start, pivot -1);
//		quickSort(arr, pivot + 1, end);
//		
//	}
//	
//	public static int getPivot(int[] arr, int start, int end) {
//		int pivotValue = arr[end];
//		int temp;
//		int x = start;
//		int y = start -1;
//		while(x <= end) {
//			if(arr[x] < pivotValue) {
//				y++;
//				temp = arr[y];
//				arr[y] = arr[x];
//				arr[x] = temp;
//			}			
//			x++;
//		}
//		y++;
//		temp = arr[y];
//		arr[y] = arr[end];
//		arr[end] = temp;
//		
//		return y;
//	}

}
