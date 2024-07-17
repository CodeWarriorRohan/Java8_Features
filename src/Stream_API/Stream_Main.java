package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Main {
    public static void main(String[] args) {

        // create a list and filter all even numbers from list

        List<Integer> list1 = List.of(22, 25, 26, 4, 71, 19, 10, 30);

        System.out.println(list1);

/*        List<Integer> list2 = new ArrayList<>();

        list2.add(12);
        list2.add(9);
        list2.add(11);
        list2.add(7);
        list2.add(10);

        System.out.println(list2);


        List<Integer> list3 = Arrays.asList(23, 13, 24, 11, 87);

        System.out.println(list3);
    */

        // Filter the list -> even numbers list

        // without stream

        List<Integer> evenList = new ArrayList<>();

        for (Integer i : list1){
            if (i % 2 == 0){
                evenList.add(i);
            }
        }
        System.out.println(evenList);

        // using stream

       /*
        Stream<Integer> stream = list1.stream();
        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
        */

        // in a single line

        List<Integer> newList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);

        // 10 < all elements

        List<Integer> newList1 = list1.stream().filter(i -> i >10).collect(Collectors.toList());
        System.out.println(newList1);

    }
}
