package org.starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ColorSteps {
    private String color;
    private String description;

    //@Given("the color is {word}")
    @Given("^the color is (.+)$")  // (.+) açgözlü (greedy) bir eşlemedir, herhangi bir karakter dizisini yakalar.
    public void the_color_is(String color) {
        this.color = color;
    }

    //@And("the description is {string}")   // {string} yer tutucusu, çift tırnak içinde bir veya daha fazla kelimeyi yakalar.
    @And("^the description is (.+)$")
    public void the_description_is(String description) {
        this.description = description;
    }

    @Then("I should see the color and the description")
    public void i_should_see_the_color_and_the_description() {
        System.out.println("Color: " + color);
        System.out.println("Description: " + description);
    }
}
