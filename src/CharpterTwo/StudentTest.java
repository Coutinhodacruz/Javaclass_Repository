package CharpterTwo;

public class StudentTest {
    public static void main(String[] args) {
        Student account1 = new Student("Coutinho Dacruz",93.5);
        Student account2 = new Student("Bobby Firmino", 78.3);


        System.out.printf("%s's letter grade is:%s%.2f%n", account1.getName(),account1.getLetterGrade(),
                account1.getAverage());

        System.out.printf("%s's letter grade is:%s%.2f%n", account2.getName(),account2.getLetterGrade(),
                account2.getAverage());

    }
}
