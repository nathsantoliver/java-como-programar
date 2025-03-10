package chap18;

public class TowersOfHanoi {
    // move recursivamente os discos entre as torres
    public static void solveTowers(int disks, int sourcePeg,
                                   int destinationPeg, int tempPeg) {
        // caso básico -- somente um disco a ser movido
        if (disks == 1) {
            System.out.printf("%n%d --> %d", sourcePeg, destinationPeg);
            return;
        }

        // passo recursivo -- move os discos (disco - 1) do sourcePeg
        // para tempPeg usando destinationPeg.
        solveTowers(disks - 1, sourcePeg, tempPeg, destinationPeg);

        // move o último disco de sourcePeg para destinationPeg
        System.out.printf("%n%d --> %d", sourcePeg, destinationPeg);

        // move (disks - 1) discos de tempPeg para destinationPeg
        solveTowers(disks - 1, tempPeg, destinationPeg, sourcePeg);
    }

    public static void main(String[] args) {

        int startPeg = 1;   // valor 1 utilizado para indicar startPeg na saída
        int endPeg = 3;     // valor 3 utilizado para indicar endPeg na saída
        int tempPeg = 2;     // valor 2 utilizado para indicar tempPeg na saída
        int totalDisks = 3;     // número de discos

        // chamada não recursiva inicial: move todos os discos.
        solveTowers(totalDisks, startPeg, endPeg, tempPeg);

    }

}
