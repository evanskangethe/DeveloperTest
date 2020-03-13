package org.example.compose;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class Memoizer<T, U> {

    private final Map<T, U> cache = new ConcurrentHashMap<>();

    /**
     * function to memoize if value is not present
     * @param function
     * @return
     */
    private Function<T, U> doMemoize(final Function<T, U> function) {
        return input -> cache.computeIfAbsent(input, function);
    }

    /**
     *
     * @param function
     * @param <T>
     * @param <U>
     * @return
     */
    public static <T, U> Function<T, U> memoize(final Function<T, U> function) {
        return new Memoizer<T, U>().doMemoize(function);
    }

    /**
     * @param Integer
     * function to check if integer is prime
     * return boolean
     */
    public static Function<Integer, Boolean> isPrime = (x) -> {

        if (x < 2) {
            return false;
        }

        int i = 2;

        while (i <= x / 2) {
            if (x % i == 0) {
                return false;

            }
            ++i;
        }
        return true;
    };
}