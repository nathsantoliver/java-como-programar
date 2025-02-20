package chap18;

public class FactorialCalculator3 {
    // declaraçoã recursiva de método fatorial
    public static long factorial(long number) {
        long result = 1;

        // declaração iterativa de metodo fatorial
        for (long i = number; i >= 1; i--) {
            result *= i;
        }

        return result;
    }

    // gera saída de fatoriais para valores 0 a 10
    public static void main(String[] args) {
        // calcula o fatorial de 0 a 10
        for (int counter = 0; counter <= 10; counter++) {
            System.out.printf("%d! = %d%n", counter, factorial(counter));
        }
    }

}
