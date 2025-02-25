package chap21.queue;

import chap21.list.EmptyListException;

public class QueueTest {
    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();

        // utiliza o metodo enqueue
        queue.enqueue(-1);
        queue.print();
        queue.enqueue(0);
        queue.print();
        queue.enqueue(1);
        queue.print();
        queue.enqueue(5);
        queue.print();

        // remove os objetos da fila
        try {

            int removedItem;

            while (true) {
                removedItem = queue.dequeue();  // utiliza metodo dequeue
                System.out.printf("%n%d dequeue%n", removedItem);
                queue.print();
            }
        } catch (EmptyListException emptyListException) {
            emptyListException.printStackTrace();
        }

    }
}
