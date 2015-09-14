package com.moyiguket.sort.bubblesort;

import com.moyiguket.sort.common.MyArrayUtil;

/**
 * Bubble sort, sometimes referred to as sinking sort, is a simple sorting
 * algorithm that repeatedly steps through the list to be sorted, compares each
 * pair of adjacent items and swaps them if they are in the wrong order. The
 * pass through the list is repeated until no swaps are needed, which indicates
 * that the list is sorted. The algorithm, which is a comparison sort, is named
 * for the way smaller elements "bubble" to the top of the list. Although the
 * algorithm is simple, it is too slow and impractical for most problems even
 * when compared to insertion sort. It can be practical if the input is usually
 * in sort order but may occasionally have some out-of-order elements nearly in
 * position.
 * 
 * from wiki:https://en.wikipedia.org/wiki/Bubble_sort
 * 
 * @author da.sun
 * 
 */
public class BubbleSort {

	/**
	 * 
	 * @param arr
	 * @return
	 */
	public int[] sort(int[] arr) {
		int[] result = new int[arr.length];
		System.arraycopy(arr, 0, result, 0, arr.length);

		for (int i = 0; i < result.length; i++) {
			for (int j = i + 1; j < result.length; j++) {
				if (result[i] > result[j]) {
					MyArrayUtil.swap(result, i, j);
				}
			}
		}
		return result;
	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int[] arr = MyArrayUtil.fillArr(10, 100);
		print(arr);
		int[] result = sort.sort(arr);
		print(result);

	}
}
