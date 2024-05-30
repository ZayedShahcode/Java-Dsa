// In infinite array we dont know the size of array

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,90,100,111,165,193,224};
        System.out.println(ans(arr,100));

        
    }

    static int ans(int[] arr,int target){
        //first find the range
        // first start with box size 2
        int start=0;
        int end=1;
         
        while(target>arr[end]){
            int newStart = end+1;
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
       
        while(start<=end){
        
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
