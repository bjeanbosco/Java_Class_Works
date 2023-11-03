public class totalAmount {
    // this is the method to which used to calculate the interest
    // it has three parameters which are amount, rate and year
    double findInterest(int principle, double rate, int time, int n) {
        // this return the interest
        return principle * (Math.pow((1 + rate / 1200), n * time));
    }

}
