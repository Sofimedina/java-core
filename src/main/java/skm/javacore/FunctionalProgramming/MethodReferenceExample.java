package skm.javacore.FunctionalProgramming;

import javax.swing.text.html.Option;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class MethodReferenceExample {

    public static void print(Integer number){
        System.out.println(number);
    }

    public static boolean isEven (Integer number){
        return number%2==0;
    };




    public static void main(String[] args) {



        System.out.println("-----printing length of each word");
        List.of("Ant","Bat","Cat","Dog","Elephant").stream()
                .map(s->s.length())
                .forEach(s-> System.out.println(s));

        System.out.println("-----printing length of each word- with method ref");
        List.of("Ant","Bat","Cat","Dog","Elephant").stream()
                .map(s->s.length())
                .forEach(System.out::println);

        System.out.println("-----printing length of each word- with all method ref");
        List.of("Ant","Bat","Cat","Dog","Elephant").stream()
                .map(String::length)
                .forEach(MethodReferenceExample::print);

        System.out.println("-----printing find even and printing the max val");
        List.of("Ant","Bat","Cat","Dog","Elephant").stream()
                .map(String::length)
                .forEach(MethodReferenceExample::print);

        System.out.println("-----printing the max");
        Integer max= List.of(23,102,45,67,34).stream()
                .filter(MethodReferenceExample::isEven)
                .max(Integer::compare).orElse(0);
        System.out.println(max);

        System.out.println("-----1 Storing functions in variables");
        Predicate<Integer> predicate = n -> n % 2 == 0;
        List.of(23,43,34,45,36,48).stream()
                .filter(predicate)
                .map(n->n*n)
                .forEach(e->System.out.println(e));

        System.out.println("-----3 Return functions from methods");
        Predicate<Integer> predicate2 = getEvenPredicate();
        List.of(23,43,34,45,36,48).stream()
                .filter(predicate2)
                .map(n->n*n)
                .forEach(e->System.out.println(e));
    }

    private static Predicate<Integer> getEvenPredicate() {
        return n -> n % 2 == 0;
    }
}
