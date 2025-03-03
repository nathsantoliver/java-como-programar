package chap23.synchronization.unsync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest {
    public static void main(String[] args) {

        // constrói o objeto compartilhado
        SimpleArray sharedSimpleArray = new SimpleArray(6);

        // cria duas tarefas a gravar no SimpleArray compartilhado
        ArrayWriter writer1 = new ArrayWriter(1, sharedSimpleArray);
        ArrayWriter writer2 = new ArrayWriter(11, sharedSimpleArray);

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
