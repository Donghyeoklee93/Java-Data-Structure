package dataStructure;

import java.util.ArrayList;

class Dog1 {
    private String name;
    private String type;

    public Dog1(String name, String type) {
        this.name = name;
        this.type = type;
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }

    public String showDogInfo() {
        return name + ", " + type;
    }
}

public class Test9 {
    public static void main(String[] args) {

        ArrayList<Dog1> list = new ArrayList<Dog1>();
        list.add(new Dog1("멍멍이", "치아와"));
        list.add(new Dog1("뽀삐", "진돗개"));
        list.add(new Dog1("순심이", "삽살개"));
        list.add(new Dog1("철이", "마르티스"));
        list.add(new Dog1("삐쭈", "푸들"));


        for(int i =0; i<list.size(); i++) {
            System.out.println(list.get(i).showDogInfo());
        }

        for(Dog1 dog : list) {
            System.out.println(dog.showDogInfo());
        }
    }

}
