package com.moyiguket.sort.QuickSort;

import com.moyiguket.sort.common.MyArrayUtil;

public class QuickSort_SecondVersion {

	public void sort(int[] vals,int left,int right){
		if(left <= right){
			int partition = partition(vals,left,right);
			sort(vals,left,partition-1);
			sort(vals,partition+1,right);
		}
		
		
	}

	private int partition(int[] vals, int left, int right) {
		int pos = (left+right)/2;
		int pivot = vals[pos];
		int partition = left;
		
		MyArrayUtil.swap(vals, pos, right);
		
		for(int i = left ; i < right-1; i++){
			if(vals[i] <= pivot){
				MyArrayUtil.swap(vals, partition, i);
				partition++;
			}
		}
		
		MyArrayUtil.swap(vals, right, partition);
		return partition;
	}
	
	public static void main(String[] args) {
		int[] vals1 = MyArrayUtil.fillArr(1000000, 1000*10000);
		int[] vals2 = new int[vals1.length];
		System.arraycopy(vals1, 0, vals2, 0, vals1.length);
//		MyArrayUtil.print(vals1);
		
		long a_start = System.currentTimeMillis();
		new QuickSort_SecondVersion().sort(vals1, 0, vals1.length-1);
		long a_end = System.currentTimeMillis();
		System.out.println("costs , "+(a_end-a_start)+ " ms");
		
		
		long b_start = System.currentTimeMillis();
		new QuickSort().sort(0, vals2.length-1, vals2);
		long b_end = System.currentTimeMillis();
		System.out.println("costs , "+(b_end-b_start)+ " ms");
		
		
	}
	
}
