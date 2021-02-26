public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        long payment12 = service.calculate(1_000_000, 9.99, 12);
        System.out.println(payment12);

        long payment24 = service.calculate(1_000_000, 9.99, 24);
        System.out.println(payment24);

        long payment36 = service.calculate(1_000_000, 9.99, 36);
        System.out.println(payment36);
    }
}
