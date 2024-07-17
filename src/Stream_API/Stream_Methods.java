package Stream_API;

import java.util.List;
import java.util.stream.Collectors;

public class Stream_Methods {

    public static void main(String[] args) {

        // 1. collect -> collects the values passed through object and stream method

        // 2. filter(Predicate) return true or false
        // boolean value functions

        List<String> names = List.of("Ajay", "Abhinav", "Mohit", "Ritik", "Aachal", "Rajat", "Aman");
        System.out.println(names);
        List<String> newName = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newName);

        // 3. map(Function) return value

        List<Integer> numbers = List.of(21, 40, 13, 9, 54, 10);
        System.out.println("numbers : "+numbers);
        List<Integer> squarnums = numbers.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println("squares : "+squarnums);

        // 4. forEach loop -> print all the elements one by one

        names.stream().forEach(e -> {
            System.out.println(e);
        });

        // 5. sorted() -> sort the values in ascending order

        System.out.println("Sorted elements :");
        numbers.stream().sorted().forEach(System.out::println);

        // 6. min() -> return optional value

        Integer integermin = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Minimum element is : "+integermin);

        Integer integermax = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("Max element is : "+integermax);

    }
}
