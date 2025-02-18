package chap16.list.listMethods.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort1 {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Cria e exibe uma lista contendo elementos do array naipes
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s%n", list);

        Collections.sort(list); // classifica ArrayList
        System.out.printf("Sorted array elements: %s%n", list);

    }
}
