package chap17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {
    public static void main(String[] args) {

        String[] strings = { "Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet" };

        // exibe strings originais
        System.out.printf("Original strings: %s%n", Arrays.asList(strings));

        // strings em maiúsculas
        System.out.printf("strings in uppercase: %s%n",
                Arrays.stream(strings)
                        .map(String::toUpperCase)
                        .collect(Collectors.toList()));

        // strings menores que "m" (sem distinção maiúsc/minúsc) em ordem crescente
        System.out.printf("strings greater than n sorted ascending: %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("m") > 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                        .collect(Collectors.toList()));

        // strings menores que "m" (sem distinção maiúsc/minúsc) em ordem decrescente
        System.out.printf("strings greater than n sorted descending: %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("m") > 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .collect(Collectors.toList()));

    }
}
