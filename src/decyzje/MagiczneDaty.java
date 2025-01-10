package decyzje;

import java.util.Scanner;

public class MagiczneDaty {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Podaj dzien: ");
        int dzien = keyboard.nextInt();

        System.out.print("Podaj miesiac liczba: ");
        int miesiac = keyboard.nextInt();

        System.out.print("Podaj dwie ostatnie cyfry roku: ");
        int rok = keyboard.nextInt();

        int data = dzien * miesiac;

        if (data == rok) {
            System.out.println("Data jest magiczna");
        } else {
            System.out.println("Data nie jest magiczna");
        }

    }
}
