package com.moyiguket.sort.insertsort;

import com.moyiguket.sort.common.MyArrayUtil;

/**
 * Insertion sort iterates, consuming one input element each repetition, and
 * growing a sorted output list. Each iteration, insertion sort removes one
 * element from the input data, finds the location it belongs within the sorted
 * list, and inserts it there. It repeats until no input elements remain.
 * 
 * @author da.sun
 * 
 */
public class InsertSort {

	private int[] initArr(int[] arr){
		int[] result = new int[arr.length+1];
		System.arraycopy(arr, 0, result, 0, arr.length);
		return result;
	}
	
	
	public int[] sort(int[] arr){
		int[] result = new int[arr.length];
		System.arraycopy(arr, 0, result, 0, arr.length);

		for(int i = 1 ; i < result.length; i++){
			int pos = i;
			int tmp = result[i];
			while(pos > 0 && result[pos-1] > tmp){
				result[pos] = result[pos-1];
				pos--;
			}
			result[pos] = tmp;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = MyArrayUtil.fillArr(10, 20);
		InsertSort sort = new InsertSort();
		arr = sort.initArr(arr);
		arr = sort.sort(arr);
		
		MyArrayUtil.print(arr);
	}
}
