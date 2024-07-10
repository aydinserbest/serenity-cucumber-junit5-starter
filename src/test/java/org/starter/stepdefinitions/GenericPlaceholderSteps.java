package org.starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GenericPlaceholderSteps {
    private String item;
    private double price;
    private int quantity;

    @Given("the item is {word}")  //{word} yer tutucusu, tek bir kelimeyi yakalar. Boşluk veya özel karakter içermez.
    //@Given("the item is {string}")  //eger senaryoda yakalanicak kelime " " icinde degilse bu metotla eslesmez.
    public void the_item_is(String item) {
        this.item = item;
    }

    @Given("the price is {double}") //{double} yer tutucusu, ondalık sayıları yakalar.
    public void the_price_is(double price) {
        this.price = price;
    }

    @Given("the quantity is {int}") //{int} yer tutucusu, tam sayıları yakalar.
    public void the_quantity_is(int quantity) {
        this.quantity = quantity;
    }

    @Then("I should see the item, price, and quantity")
    public void i_should_see_the_item_price_and_quantity() {
        System.out.println("Item: " + item);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
