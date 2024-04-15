package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;


class CustomArrayListTest {
    public static CustomArrayList<Integer> list = new CustomArrayList<>();
    @BeforeEach
    public void arrayListInitial(){
        list.clear();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(10);

    }
    @Test
    public void whenAddThenSizeIncrease(){
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
            Assertions.assertEquals(106, list.getSize());
    }
    @Test
    public void whenRemoveThenSizeDecline(){
        list.remove(3);
        Assertions.assertEquals(5, list.getSize());
    }

    @Test
    public void whenAddWithIndexThenGetSame(){
        list.add(2, 6);
        Assertions.assertEquals(6, list.get(2));
    }

    @Test
    public void whenClearThenSizeEmpty(){
        list.clear();
        Assertions.assertEquals(0, list.getSize());
    }

    @Test
    public void whenSortThenExpectedArray(){
        Comparator<Integer> comparator = (o1, o2) -> {
            if(o1 > o2)return 1;
            if (o1.equals(o2))return 0;
            return -1;
        };
        list.sort(comparator);
        Assertions.assertEquals(1,list.get(0));
        Assertions.assertEquals(2,list.get(1));
        Assertions.assertEquals(2,list.get(2));
        Assertions.assertEquals(5,list.get(3));
        Assertions.assertEquals(6,list.get(4));
        Assertions.assertEquals(10,list.get(5));
    }

    @Test
    public void whenStringSortThenExpectedArray(){
        CustomArrayList<String> listString = new CustomArrayList<>();
        listString.add("1");
        listString.add("56");
        listString.add("7890");
        listString.add("133");
        listString.add("22333");
        listString.add("123456");
        Comparator<String> comparator = (o1, o2) -> {
            if(o1.length() > o2.length())return 1;
            if (o1.length() == o2.length())return 0;
            return -1;
        };
        listString.sort(comparator);
        Assertions.assertEquals("1",listString.get(0));
        Assertions.assertEquals("56",listString.get(1));
        Assertions.assertEquals("133",listString.get(2));
        Assertions.assertEquals("7890",listString.get(3));
        Assertions.assertEquals("22333",listString.get(4));
        Assertions.assertEquals("123456",listString.get(5));
    }









}
