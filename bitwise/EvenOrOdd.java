package bitwise;

public class EvenOrOdd {
    public static void main(String args[]){
        int n=10;
        if((n&1) == 1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}
