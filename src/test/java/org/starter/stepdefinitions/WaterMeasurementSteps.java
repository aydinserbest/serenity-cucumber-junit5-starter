package org.starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class WaterMeasurementSteps {
    private double bottleWater;
    private double containerWater;

    //@Given("^I have (\\d+\\.\\d+) liters of water in my (bottle|container)$")
    @Given("^I have (\\d+(?:\\.\\d+)?) liters of water in my (bottle|container)$")
    public void i_have_liters_of_water_in_my_container(double amount, String container) {
        if (container.equals("bottle")) {
            bottleWater = amount;
        } else if (container.equals("container")) {
            containerWater = amount;
        }
    }
    /*
    // (\\d+\\.\\d+) ondalık sayıları yakalar.
        // (bottle|container) 'bottle' veya 'container' kelimelerini yakalar.
    // (\\d+(?:\\.\\d+)?) ondalık veya tam sayıları yakalar.
        // (bottle|container) 'bottle' veya 'container' kelimelerini yakalar.
     */

    @Then("^I should know the total amount of water$")
    public void i_should_know_the_total_amount_of_water() {
        double totalWater = bottleWater + containerWater;
        System.out.println("Total amount of water: " + totalWater + " liters");
        // Örnek bir kontrol
        assertEquals(4.64, totalWater, 0.01); // Burada tolerance 0.01 olarak ayarlandı
    }
}
