package com.algorithm.searching;

import com.algorithm.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 6, -3, 105, -46, 57 };
		
		mergeSort(arr);		
		
		Utility.printArray(arr);

	}
	public static void mergeSort(int[] arr) {
		int len = arr.length;
		if(len <= 1) return;
		
		int middle = len / 2;
		
		int[] lArr = new int[middle];
		int[] rArr = new int[len - middle];
		
		int rCount = 0;
		
		for(int i = 0; i < len; i++) {
			if(i < middle) {
				lArr[i] = arr[i];
			} else {
				rArr[rCount] = arr[i];
				rCount++;
			}
		}
		
		mergeSort(lArr);
		mergeSort(rArr);
		
		merge(lArr, rArr, arr);
		
	}
	
	public static void merge(int[] lArr, int[] rArr, int[] arr) {
		int lLen = lArr.length;
		int rLen = rArr.length;
		
		int l = 0;
		int r = 0;
		int i = 0;
		
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
		
		while(l < lLen) {
			arr[i] = lArr[l];
			l++;
			i++;
		}
		
		while(r < rLen) {
			arr[i] = rArr[r];
			r++;
			i++;
		}
	}

}
