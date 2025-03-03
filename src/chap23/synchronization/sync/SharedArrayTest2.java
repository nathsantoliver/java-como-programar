package chap23.synchronization.sync;

import chap23.synchronization.unsync.ArrayWriter;
import chap23.synchronization.unsync.SimpleArray;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest2 {
    public static void main(String[] args) {

        // constrói o objeto compartilhado
        SimpleArray2 sharedSimpleArray = new SimpleArray2(6);

        // cria duas tarefas a gravar no SimpleArray compartilhado
        ArrayWriter2 writer1 = new ArrayWriter2(1, sharedSimpleArray);
        ArrayWriter2 writer2 = new ArrayWriter2(11, sharedSimpleArray);

        // executa as tarefas com um ExecutorService
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(writer1);
        executorService.execute(writer2);

        executorService.shutdown();

        try {
            // espera 1 minuto para que ambos os escritores terminem a execução
            boolean tasksEnded = executorService.awaitTermination(1, TimeUnit.MINUTES);

            if (tasksEnded) {
                System.out.printf("%nContents of SimpleArray:%n");
                System.out.println(sharedSimpleArray);  // imprime o conteúdo
            } else {
                System.out.println("Timed out while waiting for tasks to finish.");
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }
}
