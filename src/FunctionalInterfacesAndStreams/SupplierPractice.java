package FunctionalInterfacesAndStreams;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierPractice {

    /**
     * Supplier is a parameterized interface that takes no arguments and returns a parameterized object
     **/
    Supplier<String> stringSupplier = () -> "Hello";
    Supplier<Integer> integerSupplier = () -> new Random().nextInt();

    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> integerSupplier2 = random::nextInt;
    }
}
