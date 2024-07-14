// Check adjacent elements. On each pass largest element is sent to end, array size to be sorted decreases 
package sorting;

import java.util.*;

 public class BubbleSort {

    static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped;
        for(int i=0;i<n;i++){
            swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,6,5,4,8,2};
        bubbleSort(arr);
        System.out.println("\n"+Arrays.toString(arr));
    }
}
