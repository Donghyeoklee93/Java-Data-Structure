package dataStructure;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("Elements of numbers : ");
        System.out.println(numbers);

        numbers.add(1, 50);
        System.out.println("\nElements of numbers : ");
        System.out.println(numbers);

        numbers.remove(2);
        System.out.println("\nElements of numbers : ");
        System.out.println(numbers);

        System.out.println("\nSecond element of numbers : ");
        System.out.println(numbers.get(2));

        System.out.println("\nIndex of 30 : ");
        System.out.println(numbers.indexOf(30));

        System.out.println("\nSize of numbers : ");
        System.out.println(numbers.size());


        Iterator<Integer> it = numbers.iterator();
        System.out.println("\niterator");
        while(it.hasNext()){
            int value = (int)it.next();
            if(value == 30){
                it.remove();
            }
            System.out.println(value);
        }
        System.out.print(numbers);


        System.out.println("\nfor each");
        for(int value : numbers){
            System.out.println(value);
        }

        System.out.println("\nfor");
        for(int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
    }
}
