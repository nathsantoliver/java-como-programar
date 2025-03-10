package chap14.stringClass;

public class StringStartEnd {
    public static void main(String[] args) {
        String[] strings = {"started", "starting", "ended", "ending"};

        // testa o metodo startsWith
        for (String string : strings) {
            if (string.startsWith("st")) {
                System.out.printf("\"%s\" starts with \"st\"%n", string);
            }
        }

        System.out.println();

        // testa o metodo startsWith iniciando na posição 2 de string
        for (String string : strings) {
            if (string.startsWith("art", 2)) {
                System.out.printf("\"%s\" starts with \"art\" at position 2%n", string);
            }
        }

        System.out.println();

        // testa o metodo endsWith
        for (String string : strings) {
            if (string.endsWith("ed")) {
                System.out.printf("\"%s\" starts with \"ed\"%n", string);
            }
        }

    }
}
