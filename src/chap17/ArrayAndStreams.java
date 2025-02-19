package chap17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayAndStreams {
    public static void main(String[] args) {

        Integer[] values = { 2, 9, 5, 0, 3, 7, 1, 4, 8, 6 };

        // exibe os valores originais
        System.out.printf("Original values: %s%n", Arrays.asList(values));

        // classifica os valores em ordem crescente com fluxos
        System.out.printf("Sorted values: %s%n",
                Arrays.stream(values)
                        .sorted()
                        .collect(Collectors.toList()));

        // valores maiores que 4
        List<Integer> greaterThan4 = Arrays.stream(values)
                                        .filter(value -> value > 4)
                                        .collect(Collectors.toList());

        System.out.printf("Values greater than 4: %s%n", greaterThan4);

        // filtra valores maiores que 4 e então classifica os resultados
        System.out.printf("Sorted values greater than 4: %s%n",
                Arrays.stream(values)
                        .filter(value -> value > 4)
                        .sorted()
                        .collect(Collectors.toList()));

        // lista greaterThan4 classifica com fluxos
        System.out.printf("Values greater than 4 (ascending with streams): %s%n",
                greaterThan4.stream()
                        .sorted()
                        .collect(Collectors.toList()));

    }
}
