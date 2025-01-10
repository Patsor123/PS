package wstep;

public class Jacek {
    public static void main(String[] args) {
        int zakupioneAkcje = 1000;

        double zakupAkcji = 32.87;
        double prowizjaBrokera = 0.02;
        double sprzedazAkcji = 33.92;

        double cenaZakupionychAkcji = zakupioneAkcje * zakupAkcji;
        double sprzedazZakupionychAkcji = zakupioneAkcje * sprzedazAkcji;

        double zakupProwizjaBrokera = cenaZakupionychAkcji * prowizjaBrokera;
        double sprzedazProwizjaBrokera = sprzedazZakupionychAkcji * prowizjaBrokera;

        double zyskJacka = sprzedazZakupionychAkcji - cenaZakupionychAkcji - (zakupProwizjaBrokera + sprzedazProwizjaBrokera);

        System.out.println("Jacek kupil akcje za " + cenaZakupionychAkcji + " zl" +
                "\nJacek zaplacil brokerowi przy zakupie " + zakupProwizjaBrokera + " zl" +
                "\nJacek otrzymal " + sprzedazZakupionychAkcji + " zl" +
                "\nJacek zaplacil brokerowi przy sprzedazy " + sprzedazProwizjaBrokera + " zl" +
                "\nJacek wyszedl na zysk " + zyskJacka + " zl");


    }
}
