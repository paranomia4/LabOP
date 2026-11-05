
/**
 * A class for calculating the future value of investments using compound interest.
 *
 * <p>
 * Calculation formula:
 * S = P * (1 + r)^t
 * where:
 * P (initialDeposit) — the initial deposit amount;
 * r (annualRate)     — the annual interest rate as a decimal;
 * t (durationYears)  — the investment duration in years.
 * </p>
 *
 * @author MaksymHonchar
 */
public class InvestmentTracker {

    // Class fields
    private double initialDeposit;
    private double annualRate;
    private int durationYears;

    public InvestmentTracker(double initialDeposit, double annualRate, int durationYears) {
        this.initialDeposit = initialDeposit;
        this.annualRate = annualRate;
        this.durationYears = durationYears;
    }

    public double calculateTotal() {
        return initialDeposit * Math.pow(1.0 + annualRate, durationYears);
    }

    public static void main(String[] args) {
        InvestmentTracker tracker = new InvestmentTracker(1000.0, 0.05, 10);
        double expectedBalance = tracker.calculateTotal();

        System.out.printf("Initial Principal: $%.2f%n", tracker.initialDeposit);
        System.out.printf("Annual Rate:       %.1f%%%n", tracker.annualRate * 100);
        System.out.printf("Duration:          %d years%n", tracker.durationYears);
        System.out.println("----------------------------------------");
        System.out.printf("Future Value:      $%.2f%n", expectedBalance);
    }
}