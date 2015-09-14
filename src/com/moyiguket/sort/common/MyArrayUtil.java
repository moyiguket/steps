package com.moyiguket.sort.common;

/**
 * 
 * @author da.sun
 *
 */
public class MyArrayUtil {
	
	public static int[] fillArr(int size, int multi) {
		int[] filled_arr = new int[size];
		for (int i = 0; i < size; i++) {
			filled_arr[i] = (int) (Math.random() * multi);
		}
		return filled_arr;
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
	}
	
	public static void swap(int[] arr, int from, int to) {
		int tmp = arr[from];
		arr[from] = arr[to];
		arr[to] = tmp;

	}
}
