package chap03;

public class Account {
    private String name;    // variável de instância
    private double balance; // variável de instância

    // Construtor de Account que recebe dois parâmetros
    public Account(String name, double balance) {   // o nome do construtor é nome da classe
        this.name = name;   // atribui name à variável de instância name

        // valida que o balance é maior que 0.0; se não for,
        // a variável de instância balance mantém seu valor inicial padrão de 0.0
        if (balance > 0.0) {    // se o saldo for válido
            this.balance = balance; // o atribui a variável de instância balance
        }
    }

    // metodo que deposita (adiciona) apenas uma quantia válida no saldo
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {      // se depositAmount for válido
            balance = balance + depositAmount;  // o adiciona ao saldo
        }
    }

    // metodo retorna o saldo da conta
    public double getBalance() {
        return balance;
    }

    // metodo para definir o nome no objeto
    public void setName(String name) {
        this.name = name;   // armazena o nome
    }

    // metodo para recuperar o nome do objeto
    public String getName() {
        return name;    // retorna o valor do nome para o chamador
    }
}
