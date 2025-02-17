package chap15.serialization;

import java.io.Serializable;

public class Account implements Serializable {

    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    // inicializa uma Account com valores padrão
    public Account() {
        this(0, "", "", 0.0);   // chama outro construtor
    }

    // inicializa uma Account com os valores fornecidos
    public Account(int account, String firstName, String lastName, double balance) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // configura o número de conta
    public void setAccount(int account) {
        this.account = account;
    }

    // obtém número de conta
    public int getAccount() {
        return account;
    }

    // configura o none
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // obtém none
    public String getFirstName() {
        return firstName;
    }

    // configura o sobrenone
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // obtém sobrenone
    public String getLastName() {
        return lastName;
    }

    // configura o número de conta
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // obtém número de conta
    public double getBalance() {
        return balance;
    }

}
