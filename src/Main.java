public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int oneYearMonthlyPayment = service.calculate(1_000_000, 1);
        System.out.println("Ежемесячная процентная ставка за 1 год: " + oneYearMonthlyPayment);

        int twoYearsMonthlyPayment = service.calculate(1_000_000, 2);
        System.out.println("Ежемесячная процентная ставка за 2 года: " + twoYearsMonthlyPayment);

        int threeYearMonthlyPayment = service.calculate(1_000_000, 3);
        System.out.println("Ежемесячная процентная ставка за 3 года: " + threeYearMonthlyPayment);
    }
}
