package chap10.interfaces;

public abstract class Employee implements Payable{

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    // construtor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // retorna o nome
    public String getFirstName() {
        return firstName;
    }

    // retorna o sobrenome
    public String getLastName() {
        return lastName;
    }

    // retorna o número de seguro social
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // retorna a representação de String do objeto Employee
    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    // OBS: não implementamos o metodo getPaymentAmount de Payable aqui, assim
    // essa classe deve ser declarada abstrata para evitar um erro de compilação.
}
