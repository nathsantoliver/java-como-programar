package chap18;

import java.math.BigInteger;

public class FibonacciCalculator {

    private static BigInteger TWO = BigInteger.valueOf(2);

    // declaração recursiva do metodo fibonacci
    public static BigInteger fibonacci(BigInteger number) {
        if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE)) {  // casos básicos
            return number;
        } else {    // passo de recursão
            return fibonacci(number.subtract(BigInteger.ONE))   // (num - 1)
                    .add(fibonacci(number.subtract(TWO)));      // + (num - 2)
        }
    }

    // exibe os valores de Fibonacci de 0 a 40
    public static void main(String[] args) {
        for (int counter = 0; counter <= 40; counter++) {
            System.out.printf("Fibonacci of %d is: %d%n",
                    counter, fibonacci(BigInteger.valueOf(counter)));
        }
    }

}
