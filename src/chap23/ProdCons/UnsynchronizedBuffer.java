package chap23.ProdCons;

public class UnsynchronizedBuffer implements Buffer {

    private int buffer = -1; // compartilhado pelas threads producer e consumer

    // coloca o valor no buffer
    public void blockingPut(int value) throws InterruptedException {
        System.out.printf("Producer writes\t%2d", value);
        buffer = value;
    }

    // retorna valor do buffer
    public int blockingGet() throws InterruptedException {
        System.out.printf("Consumer reads\t%2d", buffer);
        return buffer;
    }

}
