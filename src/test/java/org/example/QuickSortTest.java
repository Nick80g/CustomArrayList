package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void quickSortTest() {
        QuickSort<Integer> qs = new QuickSort<>();
         CustomArrayList<Integer> list = new CustomArrayList<>();
            list.add(1);
            list.add(2);
            list.add(5);
            list.add(6);
            list.add(2);
            list.add(10);

            CustomArrayList<Integer> sortList = qs.quickSort(list);
        Assertions.assertEquals(1, sortList.get(0));
        Assertions.assertEquals(2, sortList.get(1));
        Assertions.assertEquals(2, sortList.get(2));
        Assertions.assertEquals(5, sortList.get(3));
        Assertions.assertEquals(6, sortList.get(4));
        Assertions.assertEquals(10, sortList.get(5));
    }
}