package javabdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javabdd.banking.BankAccount;
import javabdd.banking.WithdrawBalance;

public class StepDefinitions {

    BankAccount bankAccount = new BankAccount("123");

    // setup the steps
    @Given("Account balance is {string}")
    public void isAccountBalanceNotZero(String accountBalance){
        bankAccount.setAccountBalance(Integer.parseInt(accountBalance));
    }

    @When("Minimum account balance maintained is {string}")
    public void isMinBalanceMaintained(String minBalance){
        bankAccount.setMinimumBalanceRequirement(Integer.parseInt(minBalance));
    }

    @Then("Successfully withdraw {string}")
    public void withdrawBalance(String amount){
        WithdrawBalance withdraw = new WithdrawBalance(bankAccount);
        assert withdraw.withdrawAmount(Integer.parseInt(amount)) > 0.0;
    }

}

