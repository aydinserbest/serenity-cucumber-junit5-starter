package org.starter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class WithdrawSteps {
    private int balance;
    private int withdrawal;

    //@Given("^I have \\$(\\d+) in my account") //it doesn't match without using ^
    //Regular expressions kullanırken, özel karakterleri kaçırmak (escape) için \ kullanmanız gerekir.
    // Örneğin, $ karakteri bir regex'de özel bir anlam taşır
    // ve \$ olarak kaçırılmalıdır.
    @Given("I have ${int} in my account") //Cucumber expressions'da $ gibi özel karakterleri kaçırmanıza gerek yoktur.
    // Bu yüzden \$ yerine $ kullanabilirsiniz.
    public void i_have_in_my_account(int balance) {
        this.balance = balance;
    }

    @When("I choose to withdraw the fixed amount of ${int}")
    public void i_choose_to_withdraw_the_fixed_amount_of(int withdrawal) {
        this.withdrawal = withdrawal;
        this.balance -= withdrawal;
    }

    @Then("the balance of my account should be ${int}")
    public void the_balance_of_my_account_should_be(int remaining) {
        assertEquals(remaining, this.balance);
    }
}
