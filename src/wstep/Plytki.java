package wstep;

import java.util.Scanner;

public class Plytki {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj cene: ");
        double cena = klawisz.nextDouble();

        double marza = 0.4;
        double zysk = cena * marza;

        System.out.println("Zysk: " + zysk);

    }
}
