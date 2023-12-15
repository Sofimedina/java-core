package skm.javacore.Collections.Queue;

import java.util.*;

class StringSizeComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(),o2.length());
    }
}
public class QueueExample {
    public static void main(String[] args) {
        System.out.println("QUEUE RUNNER");

        Queue<String> fruits=new PriorityQueue<>(new  StringSizeComparator());
        fruits.addAll(List.of("Banana","Apple","Anana","Cherry","Mango","Lime"));
        System.out.println(fruits);
        fruits.poll();
        System.out.println(fruits);
        fruits.poll();
        System.out.println(fruits);
        fruits.poll();
        System.out.println(fruits);
        fruits.poll();
        System.out.println(fruits);

        //Linked list implements queue interface

        LinkedList<Integer> number=new LinkedList<>();
        number.add(23949);
        number.add(2394);
        number.add(239);
        number.add(9);
        System.out.println(number);

        number.offer(34);
        System.out.println(number);


    }
}
