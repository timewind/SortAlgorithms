package com.lighten.exmaple.sortalgorithms;

import java.util.Arrays;

public class SortAlgorithms {
	
	 public static final boolean ENABLE_PRINT = false;
	
	 public static void main(String[] args) {
//       int[] array = new int[]{3,5,3,0,8,6,1,5,8,6,2,4,9,4,7,0,1,8,9,7,3,1,2,5,9,7,4,0,2,6};
       int[] array = new int[]{5, 3, 9, 1, 6, 4, 10, 2, 8, 7, 15, 3, 2};
//       int[] array = new int[]{1, 1, 0};

       System.out.println("Before: " + Arrays.toString(array));
       SortAlgorithms.insertionSort(array);
//       SortAlgorithms.shellSort(array);
//       SortAlgorithms.selectionSort(array);
//       SortAlgorithms.heapSort(array);
//       SortAlgorithms.bubbleSort(array);
//       SortAlgorithms.quickSort(array, 0, array.length-1);
//       SortAlgorithms.quickSortByStack(array);
//       array = SortAlgorithms.mergingSort(array);
//       SortAlgorithms.radixSort(array);
       System.out.println("After:  " + Arrays.toString(array));
   }
	
	
    /**
     * 统一控制是否控制台输出
     */
    private static void System_out_println(String str){
        if(ENABLE_PRINT){
            System.out.println(str);
        }
    }
	  /**
     * 直接插入排序
     *
     * 1. 从第一个元素开始，该元素可以认为已经被排序
     * 2. 取出下一个元素，在已经排序的元素序列中从后向前扫描
     * 3. 如果该元素（已排序）大于新元素，将该元素移到下一位置
     * 4. 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     * 5. 将新元素插入到该位置后
     * 6. 重复步骤2~5
     * @param arr  待排序数组
     */
    public static void insertionSort(int[] arr){
        for( int i=0; i<arr.length-1; i++ ) {
            for( int j=i+1; j>0; j-- ) {
                if( arr[j-1] <= arr[j] )
                    break;
                int temp = arr[j];      //交换操作
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                System_out_println("Sorting:  " + Arrays.toString(arr));
            }
        }
    }

}
