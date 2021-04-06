package javabdd.banking;

public class WithdrawBalance {

    private BankAccount bankAccount;

    public WithdrawBalance(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    public double withdrawAmount(int amount){
        if(bankAccount.getAccountBalance() > amount &&
                (bankAccount.getAccountBalance() -amount >= bankAccount.getMinimumBalanceRequirement())     ){

            return amount;
        }
        return 0.0;
    }
}
