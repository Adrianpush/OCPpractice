package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGenerators {

    //Finite Streams Using Stream static methods
    Stream<String> empty = Stream.empty();
    Stream<Integer> singleElement = Stream.of(1);
    Stream<Double> fromVararg = Stream.of(1.2, 2.2, 3.4);

    // Finite Streams from Arrays
    Integer[] integerArr = {1, 2, 3};
    Stream<Integer> integerStreamFromArray = Arrays.stream(integerArr);
    // Note - Does not work with primitives. To generate stream of primitives use IntStream.
    int[] intArr = {1, 2, 3};
    //    Stream<Integer> intStreamFromArray = Arrays.stream(intArr);
    IntStream intStream = Arrays.stream(intArr);

    //Finite Streams from Lists
    List<Double> doubles = Arrays.asList(1.2, 1.3, 1.4);
    Stream<Double> doubleStream = doubles.stream();
    Stream<Double> doubleParalelStream = doubles.parallelStream();

    //Infinite stream using Stream static methods
    /**
     * Streams.generate takes in a Supplier
     */
    Stream<Long> longStream = Stream.generate(() -> 5L);
    /**
     * Streams.iterate takes in a source value and UnaryOperator
     */
    Stream<Long> longStream2 = Stream.iterate(1L, a -> a + 1);
}
