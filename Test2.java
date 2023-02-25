package dataStructure;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> myInts = new ArrayList<Integer>(25);

        for (int i = 0; i < 10; i++) {
            myInts.add(3 * i);
        }

//        for (int i = 0; i < 10; i++) {
//            myInts[i] = (3*i);
//        }

        myInts.set(5, 44);

        System.out.println("Size of myInts: " + myInts.size());
        System.out.println(myInts);

        for (int i = 0; i < myInts.size(); i++) {
            System.out.print(myInts.get(i) + ",");
        }

//        System.out.println(myInts[1]);
    }
}
