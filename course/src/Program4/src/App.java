import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.printf("what is the student's name? "); 
        student.name = sc.nextLine();
        System.out.printf("first degree: ");
        student.grade1 = sc.nextDouble();
        System.out.printf("fhigh school: ");
        student.grade2 = sc.nextDouble();
        System.out.printf("third degree: ");
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        if(student.finalGrade() < 60.0 ) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

        sc.close();

    }
}
