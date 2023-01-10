package Comparoator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Arrays.Student;

public class ListSort {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(10, "Suresh", 650));
        list.add(new Student(11, "Suresh", 350));
        list.add(new Student(12, "Suresh", 550));


        // Collections.sort(list, new Comparator<Student>() {
        //     @Override
        //     public int compare(Student u1, Student u2) {
        //       return u1.getMarks().equals(u2.getMarks());
        //     }
        //   });
    }
}
