package org.starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {
    @Given("the price of a {string} is 40c")
    public void thePriceOfAIs40c(String string) {

    }
    @When("I checkout {int} {string}")
    public void iCheckout(Integer int1, String string) {

    }
    @Then("the total price should be 40c")
    public void theTotalPriceShouldBe40c() {

    }

}
