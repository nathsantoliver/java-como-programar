package chap16.set;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        // cria e exibe uma List<String>
        String[] colors = {"red", "white", "blue", "green", "gray",
                "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s%n", list);

        // elimina duplicatas, então imprime os valores únicos
        printNonDuplicates(list);
    }

    // cria um Set de uma coleção para eliminar duplicatas
    private static void printNonDuplicates(Collection<String> values) {
        // cria um HashSet
        Set<String> set = new HashSet<>(values);

        System.out.printf("%nNon duplicates are: ");

        for (String value : set) {
            System.out.printf("%s ", value);
        }

        System.out.println();
    }
}
