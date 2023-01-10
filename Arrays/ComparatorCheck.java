package Arrays;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorCheck implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        
        return o1.getMarks() > o2.getMarks() ? +1 : -1;
    }

    public static void main(String[] args) {
        
        ComparatorCheck chk = new ComparatorCheck();

        // ArrayList<Student> list = new ArrayList<>(chk);

        TreeSet<Student> set = new TreeSet<>(chk);

        set.add(new Student(10,"suresh",650));
		set.add(new Student(11,"suresh",350));
		set.add(new Student(12,"suresh",550));
		set.add(new Student(13,"suresh",450));

        for (Student s : set){
            System.out.println(s);
        }
    }
}
