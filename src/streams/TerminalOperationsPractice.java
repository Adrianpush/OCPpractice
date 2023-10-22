package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationsPractice {


    public static void main(String[] args) {

        Integer[] ints = {1, 2, 3, 4};
        // Count - Takes no arguments - Returns a long.
        // long count();
        long count = Arrays.stream(ints).count();
        Long count2 = Arrays.stream(ints).count();

        // min and max - Takes in a Comparator as argument - returns an Optional
        // Optional<T> min(Comparator<? super T> comparator);
        // Optional<T> max(Comparator<? super T> comparator);
        Optional<Integer> min = Arrays.stream(ints).min(Comparator.naturalOrder());
        Optional<Integer> max = Arrays.stream(ints).max(Comparator.naturalOrder());

        //findAny and findFirst Take no arguments - returns an Optional
        // Optional<T> findAny();
        // Optional<T> findFirst();
        Optional<Integer> any = Arrays.stream(ints).findAny();
        Optional<Integer> first = Arrays.stream(ints).findFirst();

        //allMatch(), anyMatch() and noneMatch() - take in a predicate and return boolean
        //NOTE can cause stream to hang
        boolean allMatch = Arrays.stream(ints).allMatch(a -> a > 0);
        boolean anyMatch = Arrays.stream(ints).anyMatch(a -> a > 0);
        boolean noneMatch = Arrays.stream(ints).noneMatch(a -> a > 0);

        //forEach() takes in a consumer, returns void
        Stream.generate(() -> 5).limit(5).forEach(System.out::println);
        Stream.generate(() -> 5).limit(5).forEach(a -> System.out.println(a));
    }


}
