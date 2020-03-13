package org.example.compose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MemoizerTest {

    @Test
    void memoize() {
        Long start = System.currentTimeMillis();
        Memoizer.memoize(Memoizer.isPrime).apply(50);
        Long end = System.currentTimeMillis();
        Long startX = System.currentTimeMillis();
        Memoizer.memoize(Memoizer.isPrime).apply(50);
        Long endX = System.currentTimeMillis();

        Long first = end - start;
        Long second = endX - startX;

        Assertions.assertEquals(true,second < first,"The Second code will take short time to compute");
    }

    @Test
    void isPrime() {
        boolean res = Memoizer.isPrime.apply(50);
        boolean res1 = Memoizer.isPrime.apply(3);
        Assertions.assertFalse(res, " 50 is not a prime number");
        Assertions.assertTrue(res1,"3 is a prime number");
    }
}