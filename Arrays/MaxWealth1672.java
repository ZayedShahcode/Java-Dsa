public class MaxWealth1672 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5},
            {9,76,43,22},
            {56,44,90}
        };
        System.out.println("Maximum wealth : "+maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] bank : accounts) {
            int sum = 0;
            for (int i : bank) {
                sum += i;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

}
