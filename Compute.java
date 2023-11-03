public class Compute {

    int interestMethod(int amount, int rate, int year) { // this method is for calculating the interest on given amount
        // it has three parameters which amount, rate and year
        // amount is the amount on which interest will charged on
        // rate it the rate which will be charged on an amount
        // the time in which interest will be charged
        return (amount * rate * year) / 100;
    }
}
