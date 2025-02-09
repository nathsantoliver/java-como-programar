package chap10;

public class PolymorphismTest {
    public static void main(String[] args) {
        // atribui uma referência de superclasse à variável de superclasse
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222",
                10000, .06
        );

        // atribui uma referência de subclasse à variável de subclasse
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "333-33-3333",
                        5000, .04, 300);

        // invoca toString no objeto de superclasse utilizando a variável de superclasse
        System.out.printf("%s %s:%n%n%s%n%n",
                "Call CommissionEmployee's toString with superclass reference ",
                "to superclass object", commissionEmployee.toString());

        // invoca toString no objeto de subclasse utilizando a variável de subclasse
        System.out.printf("%s %s:%n%n%s%n%n",
                "Call BasePlusCommissionEmployee's toString with subclass",
                "reference to subclass object", basePlusCommissionEmployee.toString());

        // invoca toString no objeto de subclasse utilizando a variável de superclasse
        CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;
        System.out.printf("%s %s:%n%n%s%n%n",
                "Call BasePlusCommissionEmployee's toString with superclass",
                "reference to superclass object", commissionEmployee2.toString());

    }
}
