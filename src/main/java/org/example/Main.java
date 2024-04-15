package org.example;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<String> list = new CustomArrayList<>();
        Comparator<String> comparator = (o1, o2) -> {
            if (o1.length() > o2.length())return 1;
            if (o1.length() < o2.length())return -1;
            return 0;
        };
        list.add("3");
        list.add("23");
        list.add("23");
        list.add("1");
        list.add("1");
        System.out.println(list.getSize());


        for (int i = 1; i <= list.getSize(); i++) {
            System.out.println(list.get(i));
        }
    }
}
