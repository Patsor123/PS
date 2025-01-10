public class Katarzyna {
    public static void main(String[] args) {

        int action = 600;
        double price = 21.77;
        double commission = 0.02;

        double actionPrice = action * price;

        double amountComission = actionPrice * commission;

        double totalPrice = actionPrice + amountComission;

        System.out.println("Kwota zapłaconą za same akcje: " + actionPrice
                + "\nWysokosc prowizji: " + amountComission
                + "\nLaczna zaplacona kwota: " + totalPrice);

    }
}
