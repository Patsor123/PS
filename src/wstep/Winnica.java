package wstep;

import java.util.Scanner;

public class Winnica {
    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj dlugosc rzedow w metrach: ");
        double dlugoscRzedu = klawisz.nextDouble();

        System.out.println("Podaj dlugosc zajmowanie miejsca przez okratowanie w metrach: ");
        double zajmowanePrzezOkratowanie = klawisz.nextDouble();

        System.out.println("Podaj odleglosc miedzy sadzonkami w metrach: ");
        double odgegloscSadzonki = klawisz.nextDouble();


        double liczbaSadzonek = (dlugoscRzedu- 2 * zajmowanePrzezOkratowanie) / odgegloscSadzonki;

        System.out.println("Liczba sadzonek: " + liczbaSadzonek);
    }
}
