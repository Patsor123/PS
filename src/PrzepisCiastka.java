import java.util.Scanner;

public class PrzepisCiastka {
    public static void main(String[] args) {

        double szklankaCukru = 1.5;
        double szklankaMasla = 1;
        double szklankaMaki = 2.75;

        //skladniki 5,25 = 48ciastek
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj liczbe  ciasteczek: ");
        int ciasteczka = klawisz.nextInt();

        double szklankaCukru1 = szklankaCukru/48;
        double szklankaMasla1 = szklankaMasla/48;
        double szklankaMaki1 = szklankaMaki/48;

        double cukier = szklankaCukru1*ciasteczka;
        double maka = szklankaMaki1*ciasteczka;
        double maslo = szklankaMasla1*ciasteczka;


        System.out.println("Do tych ciasteczek potrzebujesz  " + cukier + " szklanek cukru \n"
        + maka + " szklanek maki \n" + maslo + " szklanek maki");
    }
}
