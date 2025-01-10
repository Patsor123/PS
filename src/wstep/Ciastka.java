package wstep;

import java.util.Scanner;

public class Ciastka {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Ile zjadles ciasteczek: ");
        int ciasteczka = klawisz.nextInt();
        //40 ciastek - 10 porcji
        //4 ciastka - 400 kalorii
        // 1 ciastko - 75kalori
        int kaloriaNaJednoCiastko = 75;

        int kaloria = ciasteczka * kaloriaNaJednoCiastko;

        System.out.println("Zjadles " + ciasteczka + " i skonsumowales " + kaloria + " kalorii");
    }

}
