package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObjects {

    // Stream performs the operations on Collections and group of objects

    public static void main(String[] args) {

        // Ways to get Stream Interface Objects

        // 1. Blank - empty()

        Stream<Object> emptyStream = Stream.empty();
        System.out.println(emptyStream);

        // 2. Array, Object, Collection

        String names[] = {"Mahesh", "Ram", "Vijay", "Mohan", "Gagan"};

        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });

        // 3. Builder() method

        Stream<Object> streamBuilder = Stream.builder().build();

        // 4. stream() method on Arrays

        IntStream stream = Arrays.stream(new int[]{23, 12, 90, 11, 45, 77});
        stream.forEach(e ->{
            System.out.print(e+" ");
        });
        System.out.println();

        // 5. Direct calling stream() on the object of List, Set

        List<Integer> list = new ArrayList<>();
        list.add(31);
        list.add(10);
        list.add(45);
        list.add(4);
        list.add(17);

        Stream<Integer> stream2 = list.stream();
        stream2.forEach(e ->{
            System.out.print(e+" ");
        });
    }
}
