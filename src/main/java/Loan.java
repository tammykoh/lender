public class Loan {
    private String borrower;
    private int amount;
    private boolean isPaid;
    private double interestRate;

    private static int maxLoanAmount = 0;

    public Loan(String borrower, int amount, double interestRate) {
        this.borrower = borrower;
        this.amount = amount;
        this.interestRate = interestRate;
        this.isPaid = false;

        if (amount > maxLoanAmount) {
            maxLoanAmount = amount;
        }
    }

    public static int getMaxLoanAmount() {
        return maxLoanAmount;
    }

    public void setAsPaid() {
        this.isPaid = true;
    }

    public boolean getIsPaid() {
        return isPaid;
    }

    public String getBorrower() {
        return borrower;
    }

    public int getAmounts() {
        return amount;
    }

    public double getProfit() {
        return amount*interestRate;
    }
}

