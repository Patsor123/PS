package decyzje;

import java.util.Scanner;

public class Rzymskie {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj liczbe z przedzialu 0 do 10: ");
        int liczba = keyboard.nextInt();
        keyboard.nextLine();
        String liczbarzymska = keyboard.nextLine();


        switch(liczba) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("Nieoczekiwany błąd. Kod błędu nieznany");
                break;
        }

        switch(liczbarzymska) {
            case "I":
                System.out.println("1");
                break;
            case "II":
                System.out.println("2");
                break;
            case "III":
                System.out.println("3");
                break;
            case "IV":
                System.out.println("4");
                break;
            case "V":
                System.out.println("5");
                break;
            case "VI":
                System.out.println("6");
                break;
            case "VII":
                System.out.println("7");
                break;
            case "VIII":
                System.out.println("8");
                break;
            case "IX":
                System.out.println("9");
                break;
            case "X":
                System.out.println("10");
                break;
            default:
                System.out.println("Nieoczekiwany błąd. Kod błędu nieznany");
                break;
        }


    }
}