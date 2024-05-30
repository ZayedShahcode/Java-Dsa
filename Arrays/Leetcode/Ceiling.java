//Smallest number greater than equal to given number

public class Ceiling{
    public static void main(String[] args) {
        int[] arr = {0,2,3,4,15,16,18,22,45,89};
        int target=19;
        int ans=ceiling(arr,target);
        System.out.println(arr[ans]);
    }
    public static int ceiling(int[] arr, int target){
        if(target>arr[-1]) return -1;
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
        return start;
    }
}