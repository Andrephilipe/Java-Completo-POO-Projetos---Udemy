import java.util.Locale;
import java.util.Scanner;

import util.Calculator_v3;

public class Program_v3 {

    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        //Utilizando metodos estaticos, sem precisar estanciar a classe.
        double c = Calculator_v3.circumference(radius);
        double v = Calculator_v3.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator_v3.PI);

        sc.close();
    }


}
