package org.starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class CashWithDrawalSteps {
    private int accountBalance;
    private int amountDispensed;

    @Given("^I have \\$(100|250) in my account$") // (100|250) belirli iki değerden birini yakalar: 100 veya 250.
    public void iHaveInMyAccount(int balance) {
        this.accountBalance = balance;
        System.out.println(balance);
    }
    @When("^I (?:have request|request) \\$(20)$")  // (?:have request|request) non-capturing group, "have request" veya "request" ifadelerini yakalar,
    // fakat bu grubu yakalamaz.
    public void iRequest(int amount) {
        this.amountDispensed = amount;
    }
    @Then("${int} should be dispensed")
    public void shouldBeDispensed(int expectedAmount) {
        assertEquals(expectedAmount, amountDispensed);
    }
}
