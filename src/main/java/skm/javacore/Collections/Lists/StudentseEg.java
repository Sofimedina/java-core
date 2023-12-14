package skm.javacore.Collections.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescStudentsComparator implements Comparator<Students>{

    @Override
    public int compare(Students o1, Students o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

public class StudentseEg {

    public static void main(String[] args) {
        List<Students> students=new ArrayList<>();
        students.add(new Students(2,"Kari"));
        students.add(new Students(1,"Zelda"));
        students.add(new Students(1,"Cane"));
        students.add(new Students(1,"Ana"));
        students.add(new Students(5,"Sofi"));

        System.out.println("Students:   \t"+students);
        Collections.sort(students);
        System.out.println("Students ASC:\t"+students);
        students.sort(new DescStudentsComparator());
        System.out.println("Students DESC:\t"+students);
    }


}
