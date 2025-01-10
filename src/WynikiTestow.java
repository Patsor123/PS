import java.util.Scanner;

public class WynikiTestow {
        public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj pierwszy wynik: ");
        double wynik1 = klawisz.nextDouble();

        System.out.println("Podaj drugi wynik: ");
        double wynik2 = klawisz.nextDouble();

        System.out.println("Podaj trzeci wynik: ");
        double wynik3 = klawisz.nextDouble();

        int liczbaWynikow = 3;
        double srednia = (wynik1 + wynik2 + wynik3) / liczbaWynikow;

        System.out.println("Wynik pierwszego testu: " + wynik1
        + "\nWynik drugiego testu: " + wynik2
        + "\nWynik trzeciego testu: " + wynik3
        + "\nSrednia z testow: " + srednia);

    }

}
