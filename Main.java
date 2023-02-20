package dataStructure;

public class Main {
    public static void main(String[] args) {

        ArrayList numbers = new ArrayList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);

//        numbers.add(1, 15);
//        numbers.addFirst(5);

//        System.out.println(numbers.remove(1));

//        numbers.removeFirst();
//        numbers.removeLast();

//        System.out.println(numbers.get(0));
//        System.out.println(numbers.get(1));
//        System.out.println(numbers.get(2));
//        System.out.println(numbers.get(3));

        System.out.println(numbers.size());

        System.out.println(numbers);

//        System.out.println(numbers.indexOf(30));
//        System.out.println(numbers.indexOf(70));

//        for(int i=0; i<numbers.size(); i++){
//            System.out.println(numbers.get(i));
//        }

        ArrayList.ListIterator li = numbers.listIterator();
//        System.out.println(li.next());
//        System.out.println(li.next());
//        System.out.println(li.next());
//        System.out.println(li.next());
//        System.out.println(li.next());
//        System.out.println(li.next());

//        while(li.hasNext()){
//            System.out.println(li.next());
//        }

//        System.out.println(li.next()); // 10
//        System.out.println(li.next()); // 20
//        System.out.println(li.next()); // 30
//        System.out.println(li.next()); // 40
//
//        System.out.println(li.previous());
//        System.out.println(li.previous());
//        System.out.println(li.previous());
//        System.out.println(li.previous());
//        System.out.println(li.previous());

//        System.out.println(li.hasPrevious());

//        while(li.hasNext()){
//            System.out.println(li.next());
//        }
//
//        while(li.hasPrevious()){
//            System.out.println(li.previous());
//        }

//        while (li.hasNext()) {
//            int number = (int) li.next();
//            if (number == 30) {
//                li.add(35);
//            }
//            System.out.println(number);
//        }
//        System.out.println(numbers);

        while (li.hasNext()) {
            int number = (int) li.next();
            if (number == 30) {
                li.remove();
            }
            System.out.println(number);
        }
        System.out.println(numbers);

    }
}
