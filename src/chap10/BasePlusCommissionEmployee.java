package chap10;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;  // salário-base por semana

    // construtor de seis argumentos
    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        // a chamada implícita para construtor padrão de Object ocorre aqui
        // se grossSales é inválido, lança uma exceção
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        // se commissionRate é inválido, lança uma exceção
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        // se baseSalary é inválido, lança uma exceção
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    // retorna o salário-base
    public double getBaseSalary() {
        return baseSalary;
    }

    // calcula os lucros
    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    // retorna a representação de String de BasePlusCommissionEmployee
    @Override   // indica que esse metodo substitui um metodo da superclasse
    public String toString() {
        // não permitido: tenta acessar membros private da superclasse
        return String.format("%s %s%n%s: %.2f", "base salaried",
                super.toString(), "base salary", getBaseSalary());
    }
}
