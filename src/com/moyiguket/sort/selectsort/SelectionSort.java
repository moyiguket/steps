package com.moyiguket.sort.selectsort;

import com.moyiguket.sort.common.MyArrayUtil;

/**
 * In computer science, selection sort is a sorting algorithm, specifically an
 * in-place comparison sort. It has O(n2) time complexity, making it inefficient
 * on large lists, and generally performs worse than the similar insertion sort.
 * Selection sort is noted for its simplicity, and it has performance advantages
 * over more complicated algorithms in certain situations, particularly where
 * auxiliary memory is limited. The algorithm divides the input list into two
 * parts: the sublist of items already sorted, which is built up from left to
 * right at the front (left) of the list, and the sublist of items remaining to
 * be sorted that occupy the rest of the list. Initially, the sorted sublist is
 * empty and the unsorted sublist is the entire input list. The algorithm
 * proceeds by finding the smallest (or largest, depending on sorting order)
 * element in the unsorted sublist, exchanging it with the leftmost unsorted
 * element (putting it in sorted order), and moving the sublist boundaries one
 * element to the right.
 * 
 * from wiki:https://en.wikipedia.org/wiki/Selection_sort
 * @author da.sun
 * 
 */
public class SelectionSort {

	/**
	 * 
	 * @param arr
	 * @return
	 */
	public int[] sort(int[] arr) {
		int[] result = new int[arr.length];
		System.arraycopy(arr, 0, result, 0, arr.length);

		int minval=Integer.MAX_VALUE;
		int minIndex=0;
		for (int i = 0; i < result.length-1; i++) {
			minval=result[i];
			for (int j = i+1; j < result.length; j++) {
				if(result[j] < minval){
					minval = result[j];
					minIndex=j;
				}
			}
			swap(result, minIndex, i);
		}
		return result;
	}

	private void swap(int[] arr, int from, int to) {
		int tmp = arr[from];
		arr[from] = arr[to];
		arr[to] = tmp;

	}

	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		int[] arr = MyArrayUtil.fillArr(10, 100);
		MyArrayUtil.print(arr);
		int[] result = sort.sort(arr);
		MyArrayUtil.print(result);

	}
}
