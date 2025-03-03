package chap23.ProdCons.arrayBlockingQueue;

import chap23.ProdCons.Buffer;
import chap23.ProdCons.Consumer;
import chap23.ProdCons.Producer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BlockingBufferTest {
    public static void main(String[] args) throws InterruptedException {

        // cria novo pool de threads com duas threads
        ExecutorService executorService = Executors.newCachedThreadPool();

        // cria BlockingBuffer para armazenar ints
        Buffer sharedLocation = new BlockingBuffer();

        executorService.execute(new Producer(sharedLocation));
        executorService.execute(new Consumer(sharedLocation));
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

    }
}
