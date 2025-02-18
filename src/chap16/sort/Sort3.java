package chap16.sort;

import chap08.caseStudy1.Time2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort3 {
    public static void main(String[] args) {
        List<Time2> list = new ArrayList<>();   // cria List

        list.add(new Time2(6, 24, 34));
        list.add(new Time2(18, 14, 58));
        list.add(new Time2(6, 5, 34));
        list.add(new Time2(12, 14, 58));
        list.add(new Time2(6, 24, 22));

        // gera saída de elementos List
        System.out.printf("Unsorted array elements:%n%s%n", list);

        // classifica em ordem utilizando um comparator
        Collections.sort(list, new TimeComparator());

        // gera saída de elementos List
    System.out.printf("Sorted list elements:%n%s%n", list);
    }
}
