package Theory;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {

        // #1 Linear Seach
        int[] nums = {34,22,5,6,4,21,88,44};
        if(linearSearch(nums, 21)==-1){
            System.out.println("Does not exist");
        }
        else{
            System.out.println("It is present at index : "+linearSearch(nums, 21));
        }


        // #2  String Search
        String name="Zayed";
        char target='e';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println("Does '"+target+"' exist in the name: "+search(name, target));

        // #3 Search in 2D arrys

        int[][] arr = {
            {1,2,3,4,5},
            {9,76,43,22},
            {56,42}
        };

        System.out.println("Does 5 exist in 2D array : "+twoDSearch(arr, 5));
    }

    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
       for(char ch: str.toCharArray()){
            if(ch==target){
                return true;
            }
       }
       return false;
    }

    static boolean twoDSearch(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}


//Output
// It is present at index : 5
// [Z, a, y, e, d]
// Does 'e' exist in the name: true
// Does 5 exist in 2D array : true