package bitwise;

public class Unique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,5,4};
        System.out.println(ans(arr));

    }
    private static int ans(int[] arr){
        int unique = 0;
        for(int n: arr){
            unique = unique ^ n; // We xor all elements 0^n=n and n^n=0
        }
        return unique;
    }
}
