package decyzje;

import java.util.Scanner;

public class MasaCiezar {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Podaj mase: ");
        int masa = keyboard.nextInt();

        double ciezar = masa * 9.8;

        if (ciezar >= 1000) {
            System.out.println("Za ciezki");
        }
        else if (ciezar <= 10) {
            System.out.println("Za lekki");
        } else {
            System.out.println("Ciezar wynosi " + ciezar);
        }
    }
}
