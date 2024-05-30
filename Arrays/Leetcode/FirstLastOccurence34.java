public class FirstLastOccurence34 {
    public static void main(String args[]) {
        int[] nums = {1,2,3,6,6,7,9,9};
        int target =6;
        int[] ans = {-1,-1};
        int start= binarySearch(nums,target,true);
        int end= binarySearch(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        System.out.println(start);
        System.out.println(end);
    }
    public static int binarySearch(int[] arr,int target,boolean findStartIndex){   
        int ans=-1;

        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid= start + (end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target> arr[mid]){
                start = mid+1;
            }
            else{
                //potential ans found
                ans = mid;
                if(findStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
