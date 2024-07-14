// select max element in each iteration and send it to end and decrease array size;
package sorting;

import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int last = arr.length-i-1;
            int max = getMaxIndex(arr, 0,last);
            swap(arr,max,last);
        }
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
    static int getMaxIndex(int[] arr,int start,int end){
        int max = start;
        for(int i = start;i<=end;i++){
            if(arr[max]<arr[i]){
                swap(arr,max,i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 6, 5, 4, 8, 2 };
        selectionSort(arr);
        System.out.println("\n" + Arrays.toString(arr));
    }
}
