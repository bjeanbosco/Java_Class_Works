public class interest {
    public static void main(String args[]) {
        int amount = 100000;// amount
        int rate = 5;// rate or interest rate
        int year = 5;// years in which interest will be paid

        Compute Interest = new Compute();// object created from Compute class or it is called an instance of the class
        int Amount = Interest.interestMethod(amount, rate, year);// calling InterestMethod to get the interest to paid
        System.out.println("the Interest to be paid is " + Amount);// this print the message and amount which calculated
                                                                   // above
    }
}
