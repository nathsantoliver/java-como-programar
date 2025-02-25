package chap21.stack.composition;

import chap21.list.EmptyListException;

public class StackCompositionTest {
    public static void main(String[] args) {

        StackComposition<Integer> stack = new StackComposition<>();

        // utiliza o metodo push
        stack.push(-1);
        stack.print();
        stack.push(0);
        stack.print();
        stack.push(1);
        stack.print();
        stack.push(5);
        stack.print();

        // remove itens da pilha
        try {

            int removedItem;

            while (true) {
                removedItem = stack.pop();  // utiliza o metodo pop
                System.out.printf("%n%d popped%n", removedItem);
                stack.print();
            }

        } catch (EmptyListException emptyListException) {
            emptyListException.printStackTrace();
        }

    }
}
