package com.lighten.exmaple.sortalgorithms;

import java.util.Arrays;

public class InsertTest {
	
	public static void main(String[] args) {
		
		
		 int[] array = new int[]{4,2,8,1};
		
		insertSort(array);
		
		System.out.println(Arrays.toString(array));
	}
	
	public static void insertSort(int[] array){
		
		for (int i = 0; i < array.length-1; i++) {// 遍历数组
			//当前数字跟前面数字相比,如果小于这个数字 则交换
			for (int j = i+1; j > 0; j--) {
				if(array[j-1]<array[j]) break;
				
				int temp=array[j];
				array[j]=array[j-1];
				array[j-1]=temp;
			}
		}
		
	}

}
