package wstep;

public class NapojeBezalkoholowe {
    public static void main(String[] args) {

        int people = 12467;

        double peopleInWeek = 0.14;

        double peopleCitrus = 0.64;

        double amountPeopleInWeek = people * peopleInWeek;

        double amountPeopleCitrus = people * peopleCitrus;

        //System.out.println("Liczba ankietowanych ktorzy kupuja raz w tygudniu: " + Math.round(amountPeopleInWeek)
        //+ "\nLiczba ankietowanych ktorzy lubia smak cytrusowy: " + Math.round(amountPeopleCitrus));

        System.out.printf("Liczba ankietowanych ktorzy kupuja raz w tygudniu: %.1f \nLiczba ankietowanych ktorzy lubia smak cytrusowy: %.1f", amountPeopleInWeek, amountPeopleCitrus);

    }
}
