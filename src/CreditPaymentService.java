public class CreditPaymentService {
    public int calculate (int loan, int term, double interest) {
        double monthInterest = (interest / 12) / 100;
        double pmt = (monthInterest * Math.pow((1 + monthInterest),  term))  /
                (Math.pow((1 + monthInterest),  term) - 1 );

        return (int) (loan * pmt);
    }
}
