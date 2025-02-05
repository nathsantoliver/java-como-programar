package chap08.staticClass;

public class Employee {
    private static int count = 0;   // número de Employees criados
    private String firstName;
    private String lastName;

    // inicializa Employee, adiciona 1 a static count e
    // gera a saída de String indicando que o construtor foi chamado

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        ++count;    // incrementa contagem estática de empregados
        System.out.printf("Employee constructor: %s %s; count = %d%n",
                firstName, lastName, count);
    }

    // obtém o primeiro nome
    public String getFirstName() {
        return firstName;
    }

    // obtém o último nome
    public String getLastName() {
        return lastName;
    }

    // metodo estático para obter valor de contagem de estática
    public static int getCount() {
        return count;
    }
}
