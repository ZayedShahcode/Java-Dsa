package Theory;

import java.util.*;

public class ArrayListExample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(38);
        list.add(8);
        list.add(3);
        list.add(380);
        list.add(78);
        list.add(18);
        System.out.println(list);


        System.out.println(list.contains(44));

        list.set(0,99);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.get(4));
        // list[index] will not work here
        sc.close();
    }
}