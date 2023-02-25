package dataStructure;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(42);
        list.add(57);
        list.add(86);

        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println(list.contains(42));
        System.out.println(list.contains(43));
    }
}
