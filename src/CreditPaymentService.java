public class CreditPaymentService {
    public int calculate(int creditSummary, int years) {

        double rate = 9.99;
        double monthlyPercentRate = rate / 12 / 100;
        int creditTerm = years * 12;
        double annuityRate = (monthlyPercentRate * Math.pow((1 + monthlyPercentRate), creditTerm)) / (Math.pow((1 + monthlyPercentRate), creditTerm) - 1);
        double monthlyAnnuityPayment = annuityRate * creditSummary;
        double totalMonthlyPayment = (int) monthlyAnnuityPayment;

        return (int) totalMonthlyPayment;
    }
}
