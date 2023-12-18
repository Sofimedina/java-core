package skm.javacore.FunctionalProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class EvenNumberPredicate implements Predicate<Integer>{

    @Override
    public boolean test(Integer integer) {
        return integer%2==0;
    }
}

class CustomPrintAll implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}

class SquareNumbersMap implements Function<Integer,Integer>{
    @Override
    public Integer apply(Integer integer) {
        return integer*integer;
    }
}

class CustomForEach implements Predicate<Integer>{

    @Override
    public boolean test(Integer integer) {
        return integer%2==0;
    }
}
public class FunctionalProgrammerExample {


    public static void main(String[] args) {

        List<String> list = List.of("Apple", "Banana", "Cat", "Dog");
        List<Integer> numbers = List.of(3, 5, 3, 8, 213, 45, 4, 5, 7);
        Predicate<Integer> isOddNumber = number -> number % 2 != 0;
        Predicate<Integer> isEvenNumber = number -> number % 2 == 0;


        System.out.println("print stuff");
        list.stream().forEach(element -> System.out.println(element));

        System.out.println("-------filter at");
        list.stream().filter(element -> element.endsWith("at")).forEach(System.out::println);

        System.out.println("-------filter only odds");
        numbers.stream().filter(isOddNumber).forEach(System.out::println);

        System.out.println("-------filter only even");
        numbers.stream().filter(isEvenNumber).forEach(System.out::println);

        System.out.println("-------Sum numbers");
        System.out.println(numbers.stream().reduce(0, (number1, number2) -> number1 + number2));

        System.out.println("-------Sum only odds numbers");
        System.out.println(numbers.stream().filter(isOddNumber).reduce(0, (number1, number2) -> number1 + number2));

        System.out.println("-------Sum only even numbers");
        System.out.println(numbers.stream().filter(isOddNumber).reduce(0, (number1, number2) -> {
            System.out.println("printing sum even number" + number1 + " " + number2);
            return number1 + number2;
        }));

        System.out.println("-------Print sorted numers");
        numbers.stream().sorted().forEach(System.out::println);

        System.out.println("-------Print unique sorted numbers");
        numbers.stream().distinct().sorted().forEach(System.out::println);

        System.out.println("-------Print square of distinc");
        numbers.stream().sorted().map(number -> number * number).distinct().forEach(System.out::println);

        System.out.println("-------Print square of firt 10 numbers");
        IntStream.range(1, 10).forEach(System.out::println);

        System.out.println("map words into lower case");
        list.stream().map(word -> word.toLowerCase()).forEach(System.out::println);

        System.out.println("-------print lenght of char");
        list.stream().map(word -> word.length()).forEach(System.out::println);

        System.out.println("-------Sum 10 first number");
        System.out.println(IntStream.range(1, 11).reduce(0, (n1, n2) -> n1 + n2));

        System.out.println("-------Get the max ");
        System.out.println(Stream.of(23, 12, 34, 53).max((n1, n2) -> Integer.compare(n1, n2)).get());

        System.out.println("-------Get a list of even ");
        List<Integer> listOfEven=Stream.of(23, 12, 34, 53).filter(isEvenNumber).collect(Collectors.toList());
        System.out.println(listOfEven);

        System.out.println("-------Get a list of square of first 10 ");
        List<Integer> listOfSquares=IntStream.range(1,10).map(n->n*n).boxed().collect(Collectors.toList());
        System.out.println(listOfSquares);

        System.out.println("-------Get the max with op ");
        System.out.println(Stream.of(23,45,67,12).filter(isEvenNumber).max((n1,n2)->Integer.compare(n1,n2)));
        System.out.println(Stream.of(23,45,67,12).filter(isEvenNumber).max((n1,n2)->Integer.compare(n1,n2)).get());
        System.out.println(Stream.of(23,45,3,5).filter(isEvenNumber).max((n1,n2)->Integer.compare(n1,n2)).orElse(0));

        System.out.println("-------Get even using predicate interface ");
        Stream.of(23,45,67,12).filter(new EvenNumberPredicate()).forEach(System.out::println);

        System.out.println("-------Print using custom for each ");
        Stream.of(23,45,67,12)
                .forEach(new CustomPrintAll());

        System.out.println("-------Custom use of map the squares");
        Stream.of(2, 3, 4, 5)
                .map(new SquareNumbersMap())
                .forEach(new CustomPrintAll());


    }

}
