package chap23.synchronization.sync;

import chap23.synchronization.unsync.SimpleArray;

public class ArrayWriter2 implements Runnable {

    private final SimpleArray2 sharedSimpleArray;
    private final int startValue;

    public ArrayWriter2(int value, SimpleArray2 array) {
        startValue = value;
        sharedSimpleArray = array;
    }

    @Override
    public void run() {
        for (int i = startValue; i < startValue + 3; i++) {
            sharedSimpleArray.add(i);   // adiciona um elemento ao array compartilhado
        }
    }
}
