package chap05;

public class WhileCounter {
    public static void main(String[] args) {
        int counter = 1;  // declara e inicializa a variável de controle

        while (counter <= 10) { // condição de continuação do loop
            System.out.printf("%d ", counter);
            ++counter;  // variável de controle de incremento
        }

        System.out.println();
    }
}
