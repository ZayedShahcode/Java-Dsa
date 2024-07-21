// Whenvever given a sorted array, DO BINARY SEARCH
package Theory;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,6,7,44,223,776,2324,4434};
        int ans=binarySearch(arr, 44);
        if(ans==-1){
            System.out.println("\nElement does not exist");
        }
        else{
        System.out.println("\nElement exists at index "+ans);
        }
    }   

    public static int binarySearch(int[] arr, int target){
        int start=0;
        int end= arr.length -1;
        while(start<=end){
            // int mid=(start+end)/2; //might be possible that start + end might exceed the range of integer
            int mid = start + (end - start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
            else{ 
                start = mid+1;
            }
        }
        return -1;
    }
}
