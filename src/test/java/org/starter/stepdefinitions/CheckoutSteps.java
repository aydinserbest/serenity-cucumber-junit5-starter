package org.starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.starter.implementation.Checkout;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CheckoutSteps {
    Map<String, Integer> priceList = new HashMap<>();
    Checkout checkout = new Checkout();
    @Given("the price of a {string} is {int}c")
    public void set_the_price_of_an_item(String product, int price) {
        priceList.put(product, price);
    }
    @When("I checkout {int} {string}")
    public void add_items_to_checkout(int count, String product) {
        int price = priceList.get(product);
        checkout.add(count, price);
    }
    @Then("the total price should be {int}c")  // {int} yer tutucusu, tam sayı değerini yakalar.
// 'c' sonundaki 'cent' anlamında kullanılan sabit karakter.
    public void verify_total_price(int total) {
        int actual = checkout.getRunningTotal();
        assertEquals(total, actual);
    }
}
