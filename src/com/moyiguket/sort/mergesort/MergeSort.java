package com.moyiguket.sort.mergesort;

import com.moyiguket.sort.common.MyArrayUtil;

/**
 * Conceptually, a merge sort works as follows:Divide the unsorted list into n
 * sublists, each containing 1 element (a list of 1 element is considered
 * sorted).Repeatedly merge sublists to produce new sorted sublists until there
 * is only 1 sublist remaining. This will be the sorted list.
 * 
 * @author da.sun
 * 
 */
public class MergeSort {

	private int[] sortVals;
	
	private int[] tmpVals;
	
	public int[] sort(int[] vals){
		this.sortVals = vals;
		this.tmpVals = new int[vals.length];
		mergeSort(0, vals.length-1);
		return this.sortVals;
	}
	
	
	private void mergeSort(int left,int right){
		if(left < right){
			int center = (left+right)/2;
			mergeSort(left,center);
			mergeSort(center+1,right);
			merge(left,center,right);
		}
	}
	
	private void merge(int left,int center,int right){
		for(int i = left ; i <= right ; i ++){
			tmpVals[i] = sortVals[i];
		}
		
		int i = left;
		int j = center+1;
		int k = i;
		
		while(i <= center && j <= right){
			if(tmpVals[i] <= tmpVals[j]){
				sortVals[k] = tmpVals[i];
				i++;
			}else{
				sortVals[k] = tmpVals[j];
				j++;
			}
			k++;			
		}
		
		while(i <= center){
			sortVals[k]=tmpVals[i];
			k++;
			i++;
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] vals = MyArrayUtil.fillArr(8, 12);
		MyArrayUtil.print(vals);
		MergeSort sort = new MergeSort();
		sort.sort(vals);
		MyArrayUtil.print(vals);
	}
	
//	private void testMerge(){
//		int[] vals = {4,1,5,3};
//		MergeSort
//		
//	}
}
