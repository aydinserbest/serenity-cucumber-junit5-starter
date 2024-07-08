package org.starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.starter.implementation.Checkout;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CheckoutSteps {
    int bananaPrice = 0;
    Checkout checkout;
    @Given("the price of a {string} is {int}c")
    public void thePriceOfAIs40c(String name, int price) {
        bananaPrice = price;

    }
    @When("I checkout {int} {string}")
    public void iCheckout(int itemCount, String itemName) {
        checkout = new Checkout();
        checkout.addToBasket(itemCount, itemName);

    }
    @Then("the total price should be {int}c")
    public void theTotalPriceShouldBe40c(int totalPrice) {
        assertThat(totalPrice).isEqualTo(checkout.total());

    }

}
