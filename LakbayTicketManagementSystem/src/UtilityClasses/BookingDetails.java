package UtilityClasses;

public class BookingDetails {
    
    private static int noOfSeats;
    private static float routeFare, discountAmt, grossAmount, netAmount;

    public BookingDetails() {
    }
    
    public BookingDetails(int noOfSeats, float routeFare, float discountAmt)
    {
        this.noOfSeats = noOfSeats;
        this.routeFare = routeFare;
        this.discountAmt = discountAmt;
    }
    
    public float computeAll()
    {
        grossAmount = (noOfSeats * routeFare);
        netAmount = grossAmount - computeDiscount();
        return netAmount;
    }
    
    public float computeDiscount()
    {
        return (grossAmount * discountAmt);
    }

    public static int getNoOfSeats() {
        return noOfSeats;
    }

    public static float getRouteFare() {
        return routeFare;
    }

    public static float getDiscountAmt() {
        return discountAmt;
    }

    public static float getNetAmount() {
        return netAmount;
    }
    

}
