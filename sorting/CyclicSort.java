// Whenever given range from 1 to n DO CYCLIC SORT.element 4 is at index 3 in sorted array

package sorting;

import java.util.Arrays;

public class CyclicSort {

    static void cycliSort(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i] -1;
            if(i != correct){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,1,6,4,8,2,7};
        cycliSort(arr);
        System.out.println(Arrays.toString(arr));;
    }
}
