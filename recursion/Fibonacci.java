package recursion;

import java.util.Scanner;

class Fibonacci {

    public static int fibo(int i){
        if(i<=1){
            return i;
        }
        else{
            return (fibo(i-1)+fibo(i-2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(fibo(i));
        }
        sc.close();
    }
}
