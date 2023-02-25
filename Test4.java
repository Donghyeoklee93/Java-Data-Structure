package dataStructure;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>();
        list.add("lee donghyeok");
        list.add("kim");
        list.add("lee");

        for (String i : list) {
            System.out.println(i);
        }

//        System.out.println(list.contains("lee donghyeok"));
//        System.out.println(list.contains("Lee Donghyeok"));
        System.out.println(list.contains("kim"));
        System.out.println(list.contains("KIM"));

        System.out.println();
        System.out.println(list.isEmpty());
        System.out.println(list1.isEmpty());
    }
}
