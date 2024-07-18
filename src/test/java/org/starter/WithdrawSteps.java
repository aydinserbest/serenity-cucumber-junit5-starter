package org.starter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class WithdrawSteps {
    private int balance;
    private int withdrawal;

    //@Given("I have //$(\\d+) in my account") //without using ^
    @Given("I have ${int} in my account") //without using ^
    public void i_have_in_my_account(int balance) {
        this.balance = balance;
    }

    @When("I choose to withdraw the fixed amount of {int}")
    public void i_choose_to_withdraw_the_fixed_amount_of(int withdrawal) {
        this.withdrawal = withdrawal;
        this.balance -= withdrawal;
    }

    @Then("the balance of my account should be {int}")
    public void the_balance_of_my_account_should_be(int remaining) {
        assertEquals(remaining, this.balance);
    }
}
