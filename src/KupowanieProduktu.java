import java.util.Scanner;

public class KupowanieProduktu {
    public static void main(String[] args) {

        double podatekStanowy = 0.04;
        double podatekLokalny = 0.02;

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj cene: ");
        double cena = klawisz.nextDouble();

        double stawkaPodatku = cena * podatekStanowy;
        double stawkaPodatku2 = cena * podatekLokalny;

        double cenaZPodatkiem = cena + stawkaPodatku;
        double cenaZPodatkiem2 = cena + stawkaPodatku2;

        double lacznaCenaSprzedazy = cenaZPodatkiem + cenaZPodatkiem2 - cena;

        System.out.println("Cena produktu: " + cena + "\n Podatek stanowy: " + cenaZPodatkiem + "\n Podatek Lokalny: " + cenaZPodatkiem2 + "\n Łaczna cena sprzedazy: " + lacznaCenaSprzedazy);
    }
}
