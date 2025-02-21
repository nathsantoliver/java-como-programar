package chap19;

import java.security.SecureRandom;
import java.util.Arrays;

public class MergeSortTest {

    // chama o metodo split recursivo para iniciar a classificação por intercalação
    public static void mergeSort(int[] data) {
        sortArray(data, 0, data.length - 1);    // classifica todo o array
    }

    // divide o array, classifica subarray e intercala subarrays no array classificado
    private static void sortArray(int[] data, int low, int high) {
        // caso básico de teste; tamanho do array é igual a 1
        if ((high - low) >= 1) {    // se não for o caso básico
            int middle1 = (low + high) / 2;     // calcula o meio do array
            int middle2 = middle1 + 1;  // calcula o próximo elemento

            // gera uma saída do passo de divisão
            System.out.printf("split:   %s%n", subarrayString(data, low, high));
            System.out.printf("         %s%n", subarrayString(data, low, middle1));
            System.out.printf("         %s%n%n", subarrayString(data, middle2, high));

            // divide o array pela metade; classifica cada metade (chamadas recursivas)
            sortArray(data, low, middle1);  // primeira metade do array
            sortArray(data, middle2, high);  // segunda metade do array

            // intercala dois arrays classificadas depois que as chamadas de divisão retornam
            merge (data, low, middle1, middle2, high);
        }
    }

    // intercala dois subarrays classificados em um subarray classificado
    private static void merge(int[] data, int left, int middle1, int middle2, int right) {
        int leftIndex = left;   // índice no subarray esquerdo
        int rightIndex = middle2;   // índice no subarray direito
        int combinedIndex = left;   // índice no array temporário funcional
        int[] combined = new int[data.length];  // array de trabalho

        // gera saída de dis subarrays antes de mesclar
        System.out.printf("merge:   %s%n", subarrayString(data, left, middle1));
        System.out.printf("         %s%n", subarrayString(data, middle2, right));

        // intercala arrays até acançar o final de um deles
        while (leftIndex <= middle1 && rightIndex <= right) {
            // coloca o menor dos dois elementos atuais no resultado
            // e o move para o próximo espaço nos arrays
            if (data[leftIndex] <= data[rightIndex]) {
                combined[combinedIndex++] = data[leftIndex++];
            } else {
                combined[combinedIndex++] = data[rightIndex++];
            }
        }

        // se o array esquerdo estiver vazio
        if (leftIndex == middle2) {
            // copia o restante do array direito
            while (rightIndex <= right) {
                combined[combinedIndex++] = data[rightIndex++];
            }
        } else {    // o array direito está vazio
            // copia o restante do array esquerdo
            while (leftIndex <= middle1) {
                combined[combinedIndex++] = data[leftIndex++];
            }
        }

        // copia os valores de volta ao array original
        for (int i = left; i <= right; i++) {
            data[i] = combined[i];
        }

        // gera saída do array intercalado
        System.out.printf("         %s%n%n", subarrayString(data, left, right));
    }

    // metodo para gerar saída de certos valores no array
    private static String subarrayString(int[] data, int low, int high) {
        StringBuilder temporary = new StringBuilder();

        // gera espaços para alinhamento
        for (int i = 0; i < low; i++) {
            temporary.append("   ");
        }

        // gera a saída dos elementos que permanecem no array
        for (int i = low; i <= high; i++) {
            temporary.append(" " + data[i]);
        }

        return temporary.toString();
    }

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();

        int[] data = new int[10];   // cria o array

        for (int i = 0; i < data.length; i++) {     // preenche o array
            data[i] = 10 +  generator.nextInt(90);
        }

        System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(data));    // exibe o array
        mergeSort(data);    // classifica o array

        System.out.printf("Sorted array:%n%s%n%n", Arrays.toString(data));    // exibe o array
    }

}
