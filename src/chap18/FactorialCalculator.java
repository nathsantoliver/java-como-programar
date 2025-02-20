package chap18;

public class FactorialCalculator {

    // metodo fatorial recursivo (supõe que o parâmetro é >= 0)
    public static long factorial (long number) {
        if (number <= 1) {  // testa caso básico
            return 1;   // casos básicos: 0! = 1 e 1! = 1
        } else {    // passo de recursão
            return number * factorial(number - 1);
        }
    }

    // gera saída de fatoriais para valores de 0 a 21
    public static void main(String[] args) {
        // calcula o fatorial de 0 a 21
        for (int counter = 0; counter <= 21; counter++) {
            System.out.printf("%d! = %d%n", counter, factorial(counter));
        }
    }

}
