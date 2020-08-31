public class Loan {
    private String borrower;
    private int amount;
    private boolean isPaid;
    private double interestRate;

    public Loan(String borrower, int amount, double interestRate) {
        this.borrower = borrower;
        this.amount = amount;
        this.interestRate = interestRate;
        this.isPaid = false;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setAsPaid() {
        this.isPaid = true;
    }

    public boolean getIsPaid() {
        return isPaid;
    }

    public int getAmounts() {
        return amount;
    }

    public double getInterestRates() {
        return interestRate;
    }
}
