package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorCheck implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        
        return o1.getMarks() > o2.getMarks() ? +1 : -1;
    }

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student(10,"suresh",650),
            new Student(20,"priti",540)
            );

        System.out.println(list);
    }
}
