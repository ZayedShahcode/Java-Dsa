class RotatingDistinct33 {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,1,2,3};
        int target = 1;
        System.out.println("Position of target: "+search(arr,target));
    }
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int firstTry=binarySearch(nums,target,0,pivot);
        if(firstTry!=-1) return firstTry;
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }
    public static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int target,int start,int end){
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

