import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Kwota pieniedzy na koncie: ");
        int kwotaPieniedzy = klawisz.nextInt();

        System.out.println("Roczna stopa oprocentowania: ");
        int roczneOprocentowanie = klawisz.nextInt();

        System.out.println("Ile razy w roku odsetki sa kapitalizowane: ");
        int odsetki = klawisz.nextInt();

        System.out.println("Liczba lat ile srodki beda znajdowac sie na koncie: ");
        int lataOdsetki = klawisz.nextInt();


        double roczneOprocentowanieDecimal = roczneOprocentowanie / 100.0;

        double kwotaPoLiczbieLat = kwotaPieniedzy * Math.pow(1 + roczneOprocentowanieDecimal / odsetki, odsetki * lataOdsetki);

        //A = P(1 +r/n)^t

        System.out.printf("Kwota jaka pojawi sie na koncie po latach to %.2f", kwotaPoLiczbieLat);
    }


}
