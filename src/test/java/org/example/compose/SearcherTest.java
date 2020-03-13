package org.example.compose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearcherTest {

    @Test
    void search() {
        Integer [] data = {50,8,7,88,44,41};
        int res = Searcher.search.apply(data,88);
        int res1 = Searcher.search.apply(data,2);

        Assertions.assertEquals(3, res, "88 available in index 3");
        Assertions.assertEquals(-1, res1, "2 index not found");
    }
}