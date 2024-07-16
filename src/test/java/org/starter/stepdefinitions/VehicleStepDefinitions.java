package org.starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class VehicleStepDefinitions {
    @Given("the vehicle consists of:")
    public void theVehicleConsistsOf(DataTable dataTable) {
        Map<String, String> oneVehicle = dataTable.asMap();
        System.out.println(oneVehicle);
    }
    @Then("I should see a vehicle that matches the following description:")
    public void iShouldSeeAVehicleThatMatchesTheFollowingDescription(DataTable dataTable) {
        List<Map<String, String>> vehicles = dataTable.asMaps();

        for (Map<String, String> vehicle : vehicles) {
            System.out.println(vehicle);
        }

    }
}
