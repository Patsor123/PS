package decyzje;

import java.util.Scanner;

public class WynikiTestow {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj wynik pierwszego testu: ");
        int test1 = keyboard.nextInt();

        System.out.println("Podaj wynik drugiego testu: ");
        int test2 = keyboard.nextInt();

        System.out.println("Podaj wynik trzeciego testu: ");
        int test3 = keyboard.nextInt();

        double liczbaTestow = 3;

        double wynik = (double)(test1 + test2 + test3) / liczbaTestow;

        if(wynik >=90) {
            System.out.println("90 - 100 5");
        }
        else if(wynik >=80) {
            System.out.println("80 - 89 4");
        }
        else if(wynik >=70) {
            System.out.println("70 - 79 3");
        }
        else if(wynik >=60) {
            System.out.println("60 - 69 2");
        }
        else {
            System.out.println("Poniżej 60 1");
        }
    }
}
