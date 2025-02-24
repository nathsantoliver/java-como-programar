package chap20.genericClass;

import java.util.ArrayList;

public class Stack<T> {
    private final ArrayList<T> elements;    // ArrayList armazena elementos da pilha

    // construtor sem argumento cria uma pilha do tamanho padrão
    public Stack() {
        this(10);   // tamanho padrão da pilha
    }

    // construtor cria uma pilha com o número especificado de elementos
    public Stack(int capacity) {
        int initCapacity = capacity > 0 ? capacity : 10;    // valida
        elements = new ArrayList<T>(initCapacity);  // cria a ArrayList
    }

    // isere o elemento na pilha
    public void push(T pushValue) {
        elements.add(pushValue);    // insere pushValue na Stack
    }

    // retorna o elemento superior se não estiver vazia; do contrário lança uma EmptyStackException
    public T pop() {
        if (elements.isEmpty()) {   // se a pilha estiver vazia
            throw new EmptyStackException("Stack is empty, cannot pop");
        }

        // remove e retorna o elemento superior da Stack
        return elements.remove(elements.size() - 1);
    }
}
