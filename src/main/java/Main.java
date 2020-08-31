public class Main {
    static Loan[] Loans = new Loan[100];
    static int loansCount = 0;

    public static void addLoan(String borrower, int amount, double interestRate){
        Loan loan = new Loan(borrower, amount, interestRate);
        Loans[loansCount] = loan;
        loansCount++;
    }

    public static void setAsPaid(String borrower){
        for (int i=0; i< loansCount; i++){
            Loan loan = Loans[i];
            if (loan.getBorrower().equals(borrower)){
                loan.setAsPaid();
            }
        }
    }

    public static void listLoans(){
        for (int i=0; i< loansCount; i++){
            Loan loan = Loans[i];
            if (!loan.getIsPaid()){
                System.out.println(loan.getBorrower() + ": " + loan.getAmounts());
            }
        }
    }

    public static double calculateProfitEarned(){
        double profit = 0;
        for (int i=0; i< loansCount; i++){
            Loan loan = Loans[i];
            // if the loan was repaid, add the interest to profit
            if (loan.getIsPaid()){
                profit = loan.getProfit();
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        addLoan("Alice Betsy", 10, 0.1);
        addLoan("Ben Chee", 20, 0.2);
        addLoan("Chris Davis", 30, 0.3);
        setAsPaid("Ben Chee");
        listLoans();
        System.out.println("profit: " + calculateProfitEarned());
    }
}
