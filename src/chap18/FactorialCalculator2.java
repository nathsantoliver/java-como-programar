package chap18;

import java.math.BigInteger;

public class FactorialCalculator2 {

    // metodo fatorial recursivo (supõe que o paraâmetro é >= 0)
    public static BigInteger factorial (BigInteger number) {
        if (number.compareTo(BigInteger.ONE) <= 0) {  // testa caso básico
            return BigInteger.ONE;   // casos básicos: 0! = 1 e 1! = 1
        } else {    // passo de recursão
            return number.multiply(factorial(number.subtract(BigInteger.ONE)));
        }
    }

    // gera saída de fatoriais para valores de 0 a 21
    public static void main(String[] args) {
        // calcula o fatorial de 0 a 50
        for (int counter = 0; counter <= 50; counter++) {
            System.out.printf("%d! = %d%n", counter,
                    factorial(BigInteger.valueOf(counter)));
        }
    }

}
