import java.util.Scanner;

public class Zmienne2 {
    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj imie: ");
        String firstName = klawisz.nextLine();

        System.out.println("Podaj drugie imie: ");
        String middleName = klawisz.nextLine();

        System.out.println("Podaj nazwisko: ");
        String lastName = klawisz.nextLine();

        char firstInidial = firstName.charAt(0);;
        char middleInidial = middleName.charAt(0);;
        char lastInidial = lastName.charAt(0);;

        System.out.println("Inicjał pierwszego imienia: " + firstInidial
                + "\nInicjał drugiego imienia: " + middleInidial
                + "\nInicjał nazwiska: " + lastInidial);

    }
}
