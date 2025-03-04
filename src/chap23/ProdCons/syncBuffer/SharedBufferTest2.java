package chap23.ProdCons.syncBuffer;

import chap23.ProdCons.Buffer;
import chap23.ProdCons.Consumer;
import chap23.ProdCons.Producer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedBufferTest2 {
    public static void main(String[] args) throws InterruptedException {

        // cria um newCachedThreadPool
        ExecutorService executorService = Executors.newCachedThreadPool();

        // cria SynchronizedBuffer para armazenar ints
        Buffer sharedLocation = new SynchronizedBuffer();

        System.out.printf("%-40s%s\t\t%s%n%-40s%s%n%n", "Operation",
                "Buffer", "Occupied", "---------", "------\t\t--------");

        // executa as tarefas do produtor e consumidor
        executorService.execute(new Producer(sharedLocation));
        executorService.execute(new Consumer(sharedLocation));

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

    }
}
