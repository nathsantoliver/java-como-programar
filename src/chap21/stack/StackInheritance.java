package chap21.stack;

import chap21.list.EmptyListException;
import chap21.list.List;

public class StackInheritance<T> extends List<T> {

    // construtor
    public StackInheritance() {
        super("Stack");
    }

    // adiciona objeto à pilha
    public void push(T object) {
        insertAtFront(object);
    }

    // remove objeto da pilha
    public T pop() throws EmptyListException {
        return removeFromFront();
    }

}
