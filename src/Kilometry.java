import java.util.Scanner;

public class Kilometry {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj przejechane km: ");
        double przejechaneKm = klawisz.nextDouble();

        System.out.println("Podaj zuzyte litry paliwa: ");
        double litryPaliwa = klawisz.nextDouble();

        double kmLitr = przejechaneKm/litryPaliwa;

        System.out.println("Liczba kilometrow przejechana na litrze: " + kmLitr);
    }

}
