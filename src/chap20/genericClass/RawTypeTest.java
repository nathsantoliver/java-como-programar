package chap20.genericClass;

public class RawTypeTest {
    public static void main(String[] args) {
        Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Pilha de tipos brutos atribuídos à classe Stack da variável de tipos brutos
        Stack rawTypeStack1 = new Stack(5);

        // Stack<Double> atribuído à Stack da variável de tipos brutos
        Stack rawTypeStack2 = new Stack<Double>(5);

        // Pilha de tipos brutos atribuídos à variável Stack<Integer>
        Stack<Integer> integerStack = new Stack(10);

        testPush("rawTypeStack1", rawTypeStack1, doubleElements);
        testPop("rawTypeStack1", rawTypeStack1);
        testPush("rawTypeStack2", rawTypeStack2, doubleElements);
        testPop("rawTypeStack2", rawTypeStack2);
        testPush("integerStack", integerStack, integerElements);
        testPop("integerStack", integerStack);
    }

    // metodo genérico testPush insere elementos na pilha
    public static <T> void testPush(String name, Stack<T> stack, T[] elements) {
        System.out.printf("%nPushing elements onto %s%n", name);

        // insere elementos na Stack
        for (T element : elements) {
            System.out.printf("%s ", element);
            stack.push(element);  // insere o elemento na pilha
        }
    }

    // metodo genérico testPop remove elementos na pilha
    public static <T> void testPop(String name, Stack<T> stack) {
        // remove elementos da pilha
        try {
            System.out.printf("%nPopping elements from %s%n", name);
            T popValue;    // armazena o elemento removido da pilha

            // remove todos os elementos da Stack
            while (true) {
                popValue = stack.pop(); // remove de doubleStack
                System.out.printf("%s ", popValue);
            }
        } catch (EmptyStackException emptyStackException) {
            System.err.println();
            emptyStackException.printStackTrace();
        }
    }
}
