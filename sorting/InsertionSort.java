package sorting;
import java.util.*;
public class InsertionSort {

    static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j] <arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {5,3,1,6,4,8,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));;
    }
}
