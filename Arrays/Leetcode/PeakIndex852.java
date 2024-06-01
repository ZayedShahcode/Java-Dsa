public class PeakIndex852 {
    public static void main(String[] args) {
        int arr[] = {0,1,3,7,5,2};
        System.out.println("Mountain index: "+peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid= start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in dec part of array
                //this may be the answer, but look on left
                //this is why end !=mid-1
                end=mid;
            }else{
                //you are in asc part of array
                start=mid+1; // because we know mid+1 > mid
            }
        }
        // in the end,start==end and pointing to largest number because start and end are always trying to find max element in above 2 checks
        // hence when they are pointing to just one element, that is the max one because
        // at every point of time for start and end,, they have the bese and
        // if we are saying that only one item is remaining, hence cuz above line

        return start;
    }
}
