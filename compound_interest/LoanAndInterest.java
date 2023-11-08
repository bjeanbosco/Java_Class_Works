public class LoanAndInterest {
    static public void main(String args[]) {
        int amount = 500000;// this is variable which store an amount or principal amount
        double rate = 18;// this is the rate at which ana mount will be charged an interest
        int year = 3;// this the years in which interest will be paid in

        totalAmount Loan = new totalAmount(); // this is the object created from TotalAmount class
        double Total = Loan.findInterest(amount, rate, year, 12);// compound interest
        // the line below print message and the total amount to be paid after time
        // mentioned
        System.out.println("Total Amount is " + Total);

    }
}
