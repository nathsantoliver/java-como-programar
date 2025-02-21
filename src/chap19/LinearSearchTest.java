package chap19;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchTest {

    // realiza uma pesquisa linear nos dados
    public static int linearSearch(int data[], int searchKey) {
        // faz um loop pelo array sequencialmente
        for (int index = 0; index < data.length; index++) {
            if (data[index] == searchKey) {
                return index;   // retorna o índice de inteiros
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();

        int[] data = new int[10];   // cria o array

        for (int i = 0; i < data.length; i++) {
            data[i] = 10 + generator.nextInt(90);
        }

        System.out.printf("%s%n%n", Arrays.toString(data)); // exibe o array

        // obtém a entrada de usuário
        System.out.print("Please enter an integer value (-1 ro quit): ");
        int searchInt = input.nextInt();

        // insere repetidamente um inteiro; -1 termina o programa
        while (searchInt != -1) {
            int position = linearSearch(data, searchInt);   // realiza a pesquisa

            if (position == -1) {    // não encontrado
                System.out.printf("%d was not found%n%n", searchInt);
            } else {    // encontrado
                System.out.printf("%d was found in position %d%n%n",
                        searchInt, position);
            }

            // obtém a entrada de usuário
            System.out.print("Please enter an integer value (-1 to quit): ");
            searchInt = input.nextInt();
        }

    }

}
