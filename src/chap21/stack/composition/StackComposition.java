package chap21.stack.composition;

import chap21.list.EmptyListException;
import chap21.list.List;

public class StackComposition<T> {

    private List<T> stackList;

    // construtor
    public StackComposition() {
        stackList = new List<T>("Stack");
    }

    // adiciona objeto à pilha
    public void push(T object) {
        stackList.insertAtFront(object);
    }

    // remove objeto da pilha
    public T pop() throws EmptyListException {
        return stackList.removeFromFront();
    }

    // determina se a pilha está vazia
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    // gera saída do conteúdo de pilha
    public void print() {
        stackList.print();
    }

}
