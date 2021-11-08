package Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class StudentInfo {
    void testStudents (ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s: al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}


class Test_lambas {
    public static void main(String[] args) {
        Student st1 = new Student("Alexandr", "man", 17, 1, 9.2);
        Student st2 = new Student("Alexey", "man", 17, 1, 9.5);
        Student st3 = new Student("Danila", "man", 20, 3, 8.3);
        Student st4 = new Student("Katya", "woman", 19, 2, 9.4);
        Student st5 = new Student("Marina", "woman", 18, 2, 7.5);
        Student st6 = new Student("Mikhail", "man", 21, 4, 7.7);
        Student st7 = new Student("Anton", "man", 22, 5, 7.0);
        Student st8 = new Student("Artem", "man", 17, 1, 7.1);
        Student st9 = new Student("Maria", "woman", 20, 3, 9.0);
        Student st10 = new Student("Anastasia", "woman", 20, 3, 8.9);

        ArrayList <Student> students = new ArrayList<>();
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

        StudentInfo info = new StudentInfo();
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course-s2.course;
//            }
//        });
//        Collections.sort(students, (stud1, stud2) -> stud1.course-stud2.course);
//        System.out.println(students);

        info.testStudents(students, (Student p) -> {return p.grade > 8;});
    }
//        interface StudentsChecks {
//            boolean check (Student s);
//}

}
