package com.algorithm.sorting;

import com.algorithm.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 6, -3, 105, -46, 57 };
		
		mergeSort(arr);		
		
		Utility.printArray(arr);

	}
	public static void mergeSort(int[] arr) {
		//Check length of the array
		int len = arr.length;
		if(len <= 1) return;
		
		//Divide array into leftArray and rightArray
		int middle = len / 2;
		
		int[] lArr = new int[middle];
		int[] rArr = new int[len - middle];
		
		//Filling each array
		int rCount = 0;		
		for(int i = 0; i < len; i++) {
			if(i < middle) {
				lArr[i] = arr[i];
			} else {
				rArr[rCount] = arr[i];
				rCount++;
			}
		}
		
		//Divide both resulting arrays		
		mergeSort(lArr);
		mergeSort(rArr);
		//Merge arrays into the main array
		merge(lArr, rArr, arr);
		
	}
	
	public static void merge(int[] lArr, int[] rArr, int[] arr) {
		//Get arrays length
		int lLen = lArr.length;
		int rLen = rArr.length;
		
		//Declare the counters for each array. l for left, r for right and i for the main array
		int l = 0;
		int r = 0;
		int i = 0;
		
		//Fill the main array based on condition
		while(l < lLen && r < rLen) {
			if(lArr[l] < rArr[r]) {
				arr[i] = lArr[l];
				l++;
			} else {
				arr[i] = rArr[r];
				r++;				
			}
			i++;
		}
		
		//Fill the main array if leftArray was not emptied
		while(l < lLen) {
			arr[i] = lArr[l];
			l++;
			i++;
		}
		//Fill the main array if rightArray was not emptied
		while(r < rLen) {
			arr[i] = rArr[r];
			r++;
			i++;
		}
	}

}
