package org.example.compose;

import java.util.Arrays;
import java.util.function.BiFunction;

public class Searcher {

    /**
     * @param Integer[]
     * @param Integer
     * check the index of an integer
     *  return Integer
     */
    public static BiFunction<Integer[],Integer,Integer> search = (x , y) -> Arrays.asList(x).indexOf(y);
}
