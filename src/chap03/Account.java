package chap03;

// Figura 3.1: Account.java
// Classe Account que contém uma variável de instância name
// e metodos para configurar e obter seu valor

public class Account {
    private String name;    // variável de instância

    // metodo para definir o nome no objeto
    public void setName(String name) {
        this.name = name;   // armazena o nome
    }

    // metodo para recuperar o nome do objeto
    public String getName() {
        return name;    // retorna o valor do nome para o chamador
    }
}
