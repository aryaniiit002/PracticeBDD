package javabdd.banking;

public class BankAccount {
    private String accountID;
    private double accountBalance;
    private int minimumBalanceRequirement;

    public BankAccount(String accountID) {
        this.accountID = accountID;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getMinimumBalanceRequirement() {
        return minimumBalanceRequirement;
    }

    public void setMinimumBalanceRequirement(int minimumBalanceRequirement) {
        this.minimumBalanceRequirement = minimumBalanceRequirement;
    }
}
