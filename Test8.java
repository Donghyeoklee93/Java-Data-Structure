package dataStructure;

class Dog {
    private String name;
    private String type;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String showDogInfo() {
        return name + "," + type;
    }
}

public class Test8 {
    public static void main(String[] args) {
        Dog[] arr = new Dog[5];

//        System.out.println(arr);
//
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

        arr[0] = new Dog();
        arr[1] = new Dog();
        arr[2] = new Dog();
        arr[3] = new Dog();
        arr[4] = new Dog();

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

        arr[0].setName("나비");
        arr[0].setType("불독");

        arr[1].setName("프랭크");
        arr[1].setType("복서");

        arr[2].setName("미키");
        arr[2].setType("도베르만");

        arr[3].setName("나키");
        arr[3].setType("치와와");

        arr[4].setName("동키");
        arr[4].setType("프랭키");

//        System.out.println(arr[0].getName());
//        System.out.println(arr[0].getType());
//
//        System.out.println(arr[1].getName());
//        System.out.println(arr[1].getType());
//
//        System.out.println(arr[2].getName());
//        System.out.println(arr[2].getType());
//
//        System.out.println(arr[3].getName());
//        System.out.println(arr[3].getType());
//
//        System.out.println(arr[4].getName());
//        System.out.println(arr[4].getType());

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].showDogInfo());
        }

        for(Dog dog : arr) {
            System.out.println(dog.showDogInfo());
        }

    }
}
