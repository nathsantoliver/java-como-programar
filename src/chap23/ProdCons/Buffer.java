package chap23.ProdCons;

public interface Buffer {
    // coloca o valor int no Buffer
    public void blockingPut(int value) throws InterruptedException;
    // retorna o valor int a partir do Buffer
    public int blockingGet() throws InterruptedException;
}
