package dataStructure;

import java.util.ArrayList;

class Student {
    int studentID;
    String studentName;
    ArrayList<Subjects> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subjects>();
    }

    public void addSubject(String name, int score) {
        Subjects subject = new Subjects();
        subject.setName(name);
        subject.setScorePoint(score);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        for (Subjects s : subjectList) {
            total += s.getScorePoint();
            System.out.println("Student : " + studentName + ", " + s.getName() + " : " + s.getScorePoint());
        }
        System.out.println("Student : " + studentName + ", " + "Total score :" + total);
    }
}


class Subjects {
    private String name;
    private int scorePoint;

    public Subjects() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScorePoint() {
        return scorePoint;
    }

    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }
}


public class ArrayListTest6 {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("KOR", 100);
        studentLee.addSubject("MATH", 50);

        Student studentKim = new Student(1002, "Kim");
        studentKim.addSubject("KOR", 70);
        studentKim.addSubject("MATH", 85);
        studentKim.addSubject("ENG", 100);

        studentLee.showStudentInfo();
        System.out.println("================================================");
        studentKim.showStudentInfo();


    }
}

