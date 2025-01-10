import java.util.Scanner;

public class UlubioneMiasto {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj nazwe miasta: ");
        String city = klawisz.nextLine();

        char firstLetter = city.charAt(0);
        int amountOfLetter = city.length();
        String hugeLetter = city.toUpperCase();
        String smallLetter = city.toLowerCase();

        System.out.println("Liczba znakow: " + amountOfLetter
        + "\nNazwa miasta wielkimi letirami: " + hugeLetter
        + "\nNazwa miasta malymi literami: " + smallLetter
        + "\nPierwszy znak miasta: " + firstLetter);
    }
}
