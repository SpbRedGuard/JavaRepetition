package Streams_repetition;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestS2 {
    public static void main(String[] args) {
        Student st1 = new Student("Alexandr", 'm', 17, 1, 9.2);
        Student st2 = new Student("Alexey", 'm', 17, 1, 9.5);
        Student st3 = new Student("Danila", 'm', 20, 3, 8.3);
        Student st4 = new Student("Katya", 'w', 19, 2, 9.4);
        Student st5 = new Student("Marina", 'w', 18, 2, 7.5);
        Student st6 = new Student("Mikhail", 'm', 21, 4, 7.7);
        Student st7 = new Student("Anton", 'm', 22, 5, 7.0);
        Student st8 = new Student("Artem", 'm', 17, 1, 7.1);
        Student st9 = new Student("Maria", 'w', 20, 3, 9.0);
        Student st10 = new Student("Anastasia", 'w', 20, 3, 8.9);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
        students.add(st7);
        students.add(st8);
        students.add(st9);
        students.add(st10);

        students = students.stream().filter(element ->
                element.getAge() > 18 && element.getAvgGrade() < 8.2)
                .collect(Collectors.toList());
        System.out.println(students);
    }


}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;


    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;

    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}