package Theory;
// There is a sorted 2D matrix. Search given element in this matrix;
import java.util.*;
public class A2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {15,25,35,40},
            {28,29,37,49},
            {33,34,38,50}
        };
        System.out.println("\n37 is at position : "+Arrays.toString(search(arr, 37)));
    }
    static int[] search(int[][]matrix, int target){
        int r=0;
        int c = matrix.length -1;
        while(c < matrix.length && c>=0){
            if(matrix[r][c] == target)
            {
                return new int[]{r,c};
            }
            if(matrix[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
