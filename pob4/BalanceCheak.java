package pob4;

public class BalanceCheak {

    public void balancecheak()
    {
        double mainbal = 1000;
        double firstyearbal,secondyearbal,thirdyearbal;
        firstyearbal = mainbal + (mainbal*.05);
        secondyearbal = firstyearbal + (mainbal*.05);
        thirdyearbal = secondyearbal + (mainbal*.05);
        System.out.println(firstyearbal);
        System.out.println(secondyearbal);
        System.out.println(thirdyearbal);


    }
}
