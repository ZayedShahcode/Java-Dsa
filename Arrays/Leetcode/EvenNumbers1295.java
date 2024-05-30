
// 1295. Find Numbers with Even Number of Digits

class EvenNumbers1295 {

    public static void main(String[] args) {
        int[] arr = {99,3,222,45};
        System.out.println("Number of elements with even number of digits: "+findNumbers(arr));
    }

    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i: nums){
            if(even2(i)){
                count++;
            }
        }
    return count;
    }
    public static boolean even(int i){
        int count=0;
        while(i>0){
            count++;
            i = i/10;
        }
        return count%2==0;
    }

    // Optimized Code
    public static boolean even2(int num){
        return ((int)(Math.log10(num))+1)%2==0;
    }
}

// Method 2
// public static boolean even(int num){
//     String st = Integer.toString(num);
//     int len = st.length();
//     return len%2==0;
// }
