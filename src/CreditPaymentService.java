public class CreditPaymentService {
    public long calculate(long credit, double percent, long period) {
        double percenttransformation = percent / 100 / 12;
        double payment = credit * (percenttransformation + (percenttransformation / (Math.pow(1 + percenttransformation, period) - 1)));

        return (long) payment;
    }
}
