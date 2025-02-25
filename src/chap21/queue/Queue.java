package chap21.queue;

import chap21.list.EmptyListException;
import chap21.list.List;

public class Queue<T> {

    private List<T> queueList;

    // construtor
    public Queue() {
        queueList = new List<>("Queue");
    }

    // adiciona objeto á fila
    public void enqueue(T object) {
        queueList.insertAtBack(object);
    }

    // remove objeto da fila
    public T dequeue() throws EmptyListException {
        return queueList.removeFromFront();
    }

    // determina se a fila está vazia
    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    // gera o conteúdo da fila
    public void print() {
        queueList.print();
    }

}
