package chap07.caseStudy3;

public class GradeBook {
    private String courseName;  // nome do curso que este livro de nota representa
    private int[][] grades;   // array bidimensional de notas de aluno

    // construtor
    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    // metodo para configurar o nome do curso
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // metodo para recuperar o nome do curso
    public String getCourseName() {
        return courseName;
    }

    // realiza várias operações nos dados
    public void processGrades() {
        // gera saída de array de notas
        outputGrades();

        // chama metodos getMinimum e getMaximum
        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade in the grade book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum());

        // gera a saída de gráfico de distribuição de todas as notas em todos os testes
        outputBarChart();
    }

    // localiza nota mínima
    public int getMinimum() {
        int lowGrade= grades[0][0];    // supõe que grades[0] é a menor nota

        // faz um loop pelas linhas do array de notas
        for (int[] studentGrades : grades) {
            // faz um loop pelas colunas da linha atual
            for (int grade : studentGrades) {
                // se nota for mais baixa que lowGrade, atribui essa nota a lowGrade
                if (grade < lowGrade) {
                    lowGrade = grade;   // nova nota mais baixa
                }
            }
        }

        return lowGrade;
    }

    // localiza nota máxima
    private int getMaximum() {
        int highGrade= grades[0][0];    // supõe que grades[0] é a maior nota

        // faz um loop pelas linhas do array de notas
        for (int[] studentGrades : grades) {
            // faz um loop pelas colunas da linha atual
            for (int grade : studentGrades) {
                // se nota for mais alta que highGrade, atribui essa nota a highGrade
                if (grade > highGrade) {
                    highGrade = grade;   // nova nota mais alta
                }
            }
        }

        return highGrade;
    }

    // determina média do conjunto particular de notas
    private double getAverage(int[] setOfGrades) {
        int total = 0;

        // soma notas de um aluno
        for (int grade : setOfGrades) {
            total += grade;
        }
        // retorna média de notas
        return (double) total / setOfGrades.length;
    }

    // gera a saída do gráfico de barras exibindo distribuição total de notas
    private void outputBarChart() {
        System.out.println("Overall grade distribution:");

        // armazena frequência de notas em cada intervalo de 10 notas
        int[] frequency = new int[11];

        // para cada nota em GradeBook, incrementa a frequência apropriada
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                ++frequency[grade / 10];
            }
        }

        // para cada frequência de nota, imprime a barra no gráfico
        for (int count = 0; count < frequency.length; count++) {
            // gera saída do rótulo de barra ("00-09: ", ..., "90-99: ", "100: ")
            if (count == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }

            // imprime a barra de asteriscos
            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // gera a saída do conteúdo do array de notas
    private void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.print("            ");

        // cria um título de coluna para cada um dos testes
        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Test %d  ", test + 1);
        }

        System.out.println("Average");  // título da coluna de média do aluno

        // cria linhas/colunas de texto que representam notas de array
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for (int test : grades[student]) {  // gera saída de notas do aluno
                System.out.printf("%8d", test);
            }

            // chama metodo getAverage para calcular a média do aluno
            // passa linha de notas como o argumento para getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }

    }
}
