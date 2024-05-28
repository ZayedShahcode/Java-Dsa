package Theory;
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1,2,6,7,44,223,776,2324,4434};
        int ans=orderAgnosticBS(arr, 44);
        if(ans==-1){
            System.out.println("Element does not exist");
        }
        else{
        System.out.println("Element exists at index "+ans);
        }
    }
    static int orderAgnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        //find whether array is ascending or descending
        boolean isAsc=(arr[start]<arr[end]);
        


        while(start<=end){
            int mid = start + (end - start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else{ 
                    start = mid+1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid-1;
                }
                else{ 
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
