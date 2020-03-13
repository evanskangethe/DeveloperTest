package org.example;

import org.example.compose.Memoizer;
import org.example.compose.Searcher;

public class App 
{
    public static void main( String[] args )
    {
        Integer [] data = {45,7 , 8 , 9};
        System.out.println(  Memoizer.isPrime.apply(9));
        System.out.println(  Memoizer.isPrime.apply(19));
        System.out.println(  Searcher.search.apply(data,9));
        System.out.println(  Searcher.search.apply(data,91));
    }
}
