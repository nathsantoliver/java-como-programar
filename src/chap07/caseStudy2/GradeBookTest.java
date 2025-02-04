package chap07.caseStudy2;

public class GradeBookTest {
    public static void main(String[] args) {
        // array de notas de aluno
        int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        GradeBook myGradeBook = new GradeBook(
                "CS101 Introduction to Java Programming",
                gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}
