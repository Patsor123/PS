package wstep;

import java.util.Scanner;

public class DaneOsobowe {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String imie = klawisz.nextLine();

        System.out.println("Podaj nazwisko: ");
        String nazwisko = klawisz.nextLine();

        System.out.println("Podaj ulice: ");
        String ulica = klawisz.nextLine();

        System.out.println("Podaj numerdomu: ");
        int numerdomu = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj nazwe miasta: ");
        String miasto = klawisz.nextLine();
        klawisz.nextLine();

        System.out.println("Podaj kod pocztowy: ");
        String kodpocztowy = klawisz.nextLine();
        klawisz.nextLine();

        System.out.println("Podaj numer telefonu: ");
        String numertelefonu = klawisz.nextLine();

        System.out.println("Twoje imie i nazwisko: " + imie + " " + nazwisko +
                        "\n Ulica i numer domu: " + ulica + " " + numerdomu +
                        "\n Nazwa miasta i kod pocztowy: " + miasto + " " + kodpocztowy +
                        "\n Numer telefonu: " + numertelefonu);

    }

}
