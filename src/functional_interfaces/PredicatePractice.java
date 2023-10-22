package functional_interfaces;

import java.util.function.Predicate;

public class PredicatePractice {

    /** A Predicate is a functional interface that takes a parameterized argument and returns a primitive boolean **/
    Predicate<String> stringPredicate = a -> a.length() > 20;
    Predicate<String> stringPredicate2 = String::isEmpty;
    Predicate<Integer> integerPredicate = a -> a > 20;

    /** A BiPredicate   **/

}
