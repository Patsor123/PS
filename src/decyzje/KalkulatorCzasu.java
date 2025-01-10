package decyzje;

import java.util.Scanner;

public class KalkulatorCzasu {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Podaj sekundy: ");
        int sekundy = keyboard.nextInt();

        int minuta = sekundy/60;
        int godzina = sekundy/3600;
        int dzien = sekundy/86400;


        System.out.println( sekundy + " sekund to " + dzien + " dni, " + godzina + " godzin, " + minuta + " minut i " + sekundy + " sekund");

    }
}
