import java.util.Scanner;

public class Rachunek {
    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj cene posilku: ");
        double price = klawisz.nextDouble();

        double tax = 0.675;
        double tip = 0.2;

        double valueTax = price * tax;
        double valueTip = price * tip;

        double totalPrice = price + valueTip + valueTax;

        System.out.println("Cena posilku: " + price
        + "\nWartosc podatku: " + valueTax
        + "\nWysokosc napiwku: +" + valueTip
        + "\nLaczna kwota: " + totalPrice);
    }
}
