package org.starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.starter.implementation.Checkout;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CheckoutSteps {
    Map<String, Integer> priceList = new HashMap<>();
    Checkout checkout = new Checkout(); // Checkout nesnesini burada başlatın

    @Given("the price of a {string} is {int}c")
    public void thePriceOfAIs(String name, int price) {
        priceList.put(name, price);
    }

    @When("I checkout {int} {string}")
    public void iCheckout(int itemCount, String itemName) {
        int price = priceList.get(itemName);
        checkout.addToBasket(itemCount, price);
    }

    @Then("the total price should be {int}c")
    public void theTotalPriceShouldBe(int totalPrice) {
        assertThat(totalPrice).isEqualTo(checkout.total());
    }
}
