package chap19;

import java.security.SecureRandom;
import java.util.Arrays;

public class SelectionSortTest {

    // classifica o array utilizando a classificação por seleção
    public static void selectionSort(int[] data) {
        // faz um loop sobre data.length - 1 elementos
        for (int i = 0; i < data.length - 1; i++) {
            int smallest = 1;   // primeiro índice do array remanescente

            // faz um loop para localizar o índice do menor elemento
            for (int index = i + 1; index < data.length; index++) {
                if (data[index] < data[smallest]) {
                    smallest = index;
                }
            }

            swap(data, i, smallest);    // troca o menor elemento na posição
            printPass(data, i + 1, smallest); // passagem de saída do algoritmo
        }
    }

    // metodo auxiliar para trocar valores em dois elementos
    private static void swap(int[] data, int first, int second) {
        int temporary = data[first];    // armazena o primeiro em temporário
        data[first] = data[second];     // substitui o primeiro pelo segundo
        data[second] = temporary;   // coloca o temporário no segundo
    }

    // imprime uma passagem do algoritmo
    private static void printPass(int[] data, int pass, int index) {
        System.out.printf("after pass %2d: ", pass);

        // saída de elementos até item selecionado
        for (int i = 0; i < index; i++) {
            System.out.printf("%d  ", data[i]);
        }

        System.out.printf("%d* ", data[index]);     // indica troca

        // termina de gerar a saída do array
        for (int i = index + 1; i < data.length; i++) {
            System.out.printf("%d  ", data[i]);
        }

        System.out.printf("%n               ");     // para alinhamento

        // indica quantidade do array que é classificado
        for (int j = 0; j < pass; j++) {
            System.out.print("--  ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();

        int[] data = new int[10];   // cria o array

        for (int i = 0; i < data.length; i++) {     // preenche o array
            data[i] = 10 + generator.nextInt(90);
        }

        System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(data));    // exibe o array

        selectionSort(data);    // classifica o array

        System.out.printf("Sorted array:%n%s%n%n", Arrays.toString(data));  // exibe o array
    }

}
