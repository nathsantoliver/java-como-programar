package chap20.wildcarsMethods;

import java.util.ArrayList;

public class WildcardTest {
    public static void main(String[] args) {
        // cria, inicializa e gera saída de ArrayList de Integers,
        // então exibe o total dos elementos
        Integer[] integers = { 1, 2, 3, 4, 5 };
        ArrayList<Integer> integerList = new ArrayList<>();

        // insere elementos na integerList
        for (Integer element : integers) {
            integerList.add(element);
        }

        System.out.printf("integerList contains: %s%n", integerList);
        System.out.printf("Total of the elements in integerList: %.0f%n%n", sum(integerList));

        // cria, inicializa e gera saída de ArrayList de Doubles,
        // então exibe o total dos elementos
        Double[] doubles = { 1.1, 3.3, 5.5 };
        ArrayList<Double> doubleList = new ArrayList<>();

        // insere elementos na doubleList
        for (Double element : doubles) {
            doubleList.add(element);
        }

        System.out.printf("doubleList contains: %s%n", doubleList);
        System.out.printf("Total of the elements in doubleList: %.1f%n%n", sum(doubleList));

        // cria, inicializa e gera saída de ArrayList de números contendo
        // Integers e Doubles, e então exibe o total dos elementos
        Number[] numbers = { 1, 2.4, 3, 4.1 };  // Integers e Doubles
        ArrayList<Number> numberList = new ArrayList<>();

        // insere elementos na numberList
        for (Number element : numbers) {
            numberList.add(element);
        }

        System.out.printf("numberList contains: %s%n", numberList);
        System.out.printf("Total of the elements in numberList: %.1f%n", sum(numberList));
    }

    // totaliza os elementos; usando um curinga no parâmetro ArrayList
    public static double sum(ArrayList<?extends Number> list) {
        double total = 0;   // inicializa o total

        // calcula a soma
        for (Number element : list) {
            total += element.doubleValue();
        }

        return total;
    }
}
