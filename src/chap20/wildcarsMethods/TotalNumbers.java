package chap20.wildcarsMethods;

import java.util.ArrayList;

public class TotalNumbers {
    public static void main(String[] args) {
        // cria, inicializa e gera saída de ArrayList de números contendo
        // Integers e Doubles, e então exibe o total dos elementos
        Number[] numbers = { 1, 2.4, 3, 4.1 };  //Integers e Doubles
        ArrayList<Number> numberList = new ArrayList<>();

        for (Number element : numbers) {
            numberList.add(element);    // insere cada número na numberList
        }

        System.out.printf("numberList contains: %s%n", numberList);
        System.out.printf("Total of the elements in numberList: %.1f%n", sum(numberList));
    }

    // calcula o total de elementos em ArrayList
    public static double sum(ArrayList<Number> list) {
        double total = 0;   // inicializa o total

        // calcula a soma
        for (Number element : list) {
            total += element.doubleValue();
        }

        return total;
    }
}
