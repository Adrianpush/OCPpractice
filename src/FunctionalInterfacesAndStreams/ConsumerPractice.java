package FunctionalInterfacesAndStreams;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerPractice {

    /** A Consumer is a parameterized interface that takes one argument and return void **/

    Consumer<String> stringConsumer = (x) -> System.out.println(x);
    Consumer<String> stringConsumer2 = System.out::println;

    private static int number = 0;
    Consumer<Integer> integerConsumer = ConsumerPractice::increment;

    private static void increment(int amount) {
        number += amount;
    }

    private static void increment(int amountOne, int amountTwo) {
        number += amountOne;
        number *= amountTwo;
    }

    /** A bi-consumer is a variation on the Consumer interface that takes two arguments and returns void.
    The type of the arguments can be the same or different. **/

    BiConsumer<Integer, Integer> biConsumer = ConsumerPractice::increment;
    BiConsumer<Integer, Integer> biConsumer2 = (a, b) -> increment(a, b);
}
