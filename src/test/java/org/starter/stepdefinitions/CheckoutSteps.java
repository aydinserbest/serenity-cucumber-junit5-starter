package org.starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {
    @Given("the price of a {string} is 40c")
    public void the_price_of_a_is_40c(String string) {

    }
    @When("I checkout {int} {string}")
    public void i_checkout(Integer int1, String string) {

    }
    @Then("the total price should be 40c")
    public void the_total_price_should_be_40c() {

    }

}
