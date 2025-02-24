package chap20;

public class GenericMethodTest {
    public static void main(String[] args) {
        // cria arrays de Integer, Double e Character
        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray);   // passa um array de Integer
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray);   // passa um array de Integer
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray);   // passa um array de Integer
    }

    // metodo genérico printArray
    public static <T> void printArray(T[] inputArray) {
        // exibe elementos do array
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }

        System.out.println();
    }
}
