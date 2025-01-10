package wstep;

public class MieszkaniePowierzchnia {
    public static void main(String[] args) {

        int dlugosc1 = 3;
        int dlugosc2 = 2;
        int dlugosc3 = 2;

        int szerokosc1 = 4;
        int szerokosc2 = 3;
        int szerokosc3 = 2;

        int pomieszczenie1 = dlugosc1 * szerokosc1;
        int pomieszczenie2 = dlugosc2 * szerokosc2;
        int pomieszczenie3 = dlugosc3 * szerokosc3;

        double powierzchniaCalkowita = pomieszczenie1 + pomieszczenie1 + pomieszczenie2 + pomieszczenie3;

        int osoby = 4;

        double powierzchniaNaOsobe = powierzchniaCalkowita / osoby;

        System.out.println("Powierzchnia przypadajaca na jedna osobe: " + powierzchniaNaOsobe);

    }
}

