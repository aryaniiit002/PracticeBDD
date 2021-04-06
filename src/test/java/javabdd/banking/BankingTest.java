package javabdd.banking;

import org.junit.Test;

public class BankingTest {
    // this is UNIT test
    @Test
    public void testWithDraw() {
        BankAccount bankAccount = new BankAccount("123");
        bankAccount.setAccountBalance(1000);// Given
        bankAccount.setMinimumBalanceRequirement(100);// when
        //withdraw limit = 1000 - 100 <= 900

        WithdrawBalance withdrawBalance = new WithdrawBalance(bankAccount);
        //then
        assert withdrawBalance.withdrawAmount(900) > bankAccount.getMinimumBalanceRequirement();

    }
}
