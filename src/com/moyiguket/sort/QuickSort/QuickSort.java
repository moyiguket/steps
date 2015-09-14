package com.moyiguket.sort.QuickSort;

import com.moyiguket.sort.common.MyArrayUtil;

/**
 * 
 * @author da.sun
 *
 */
public class QuickSort {
	
	public void sort(int left,int right,int[] vals){
		int partition = getPatition(left,right,vals);
		if(left < partition-1){
			sort(left, partition-1,vals);
		}
		if(partition < right){
			sort(partition, right,vals);			
		}
		
	}

	private int getPatition(int left, int right,int[] vals) {
		int middle = (left+right)/2;
		int pivot = vals[middle];
		
		int i = left;
		int j = right;
		
		while( i <= j){
			while(vals[i] < pivot){
				i++;
			}
			while(vals[j] > pivot){
				j--;
			}
			if( i <= j){
				MyArrayUtil.swap(vals, i, j);
				i++;
				j--;
			}
		}
		
		return i;
	}
	
	
	public static void main(String[] args) {
		int[] arr = MyArrayUtil.fillArr(20, 100);
		MyArrayUtil.print(arr);
		QuickSort sort = new QuickSort();
		sort.sort(0, arr.length-1, arr);
		MyArrayUtil.print(arr);
	}
	
	
}
