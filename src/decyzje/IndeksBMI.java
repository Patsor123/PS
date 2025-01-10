package decyzje;

import java.util.Scanner;

public class IndeksBMI {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Podaj wage w kg: ");
        double waga = keyboard.nextDouble();

        System.out.print("Podaj wzrost w metrach: ");
        double wzrost = keyboard.nextDouble();

        double bmi = waga/(wzrost*wzrost);

        if (bmi >=18.5 && bmi<=25) {
            System.out.println("super");
        }
        else if (bmi < 18) {
            System.out.println("Niedowaga");
        }
        else if (bmi > 25) {
            System.out.println("Nadwaga");
        }
    }
}
