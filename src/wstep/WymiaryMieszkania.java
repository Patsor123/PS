package wstep;

import java.util.Scanner;

public class WymiaryMieszkania {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj dlugosc pokoju nr1: ");
        int dlugosc1 = klawisz.nextInt();

        System.out.println("Podaj szerokosc pokoju nr1: ");
        int szerokosc1 = klawisz.nextInt();

        System.out.println("Podaj dlugosc pokoju nr2: ");
        int dlugosc2 = klawisz.nextInt();

        System.out.println("Podaj szerokosc pokoju nr2: ");
        int szerokosc2 = klawisz.nextInt();

        System.out.println("Podaj dlugosc pokoju nr3: ");
        int dlugosc3 = klawisz.nextInt();

        System.out.println("Podaj szerokosc pokoju nr3: ");
        int szerokosc3 = klawisz.nextInt();


        System.out.println("Podaj dlugosc pokoju nr4: ");
        int dlugosc4 = klawisz.nextInt();

        System.out.println("Podaj szerokosc pokoju nr4: ");
        int szerokosc4 = klawisz.nextInt();


        int pomieszczenie1 = dlugosc1 * szerokosc1;
        int pomieszczenie2 = dlugosc2 * szerokosc2;
        int pomieszczenie3 = dlugosc3 * szerokosc3;
        int pomieszczenie4 = dlugosc4 * szerokosc4;

        double powierzchniaCalkowita = pomieszczenie1 + pomieszczenie2 + pomieszczenie3 + pomieszczenie4;

        int osoby = 4;

        double powierzchniaNaOsobe = powierzchniaCalkowita / osoby;

        System.out.println("Powierzchnia przypadajaca na jedna osobe: " + powierzchniaNaOsobe);

    }
}
