package org.starter.stepdefinitions.flight;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.When;
import org.starter.domain.FlightStatus;
import org.starter.domain.PastFlight;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class PastFlightDestinationStep {
    @DataTableType
    public PastFlight pastFlightType(Map<String, String> entry) {
        return new PastFlight(entry.get("Flight Number"),
                LocalDate.parse(entry.get("Date")),
                FlightStatus.valueOf(entry.get("Status")));
        //Cucumber provides a single row as a map of Strings.
        // We convert the row to whatever domain object we need.
    }
    //We can now pass a list of PastFlight domain objects directly to our step definition method,
    // like this: @When("{word} asks for the following flight to be credited to his account:")
    public void creditFlights(String name, List<PastFlight> requestedFlights) {
        requestedFlights.forEach(System.out::println);
    }
    //
    /*
    Direct pass and convert way, but this is not readable,
    so we use @DataTableType

    @When("{} asks for the following flight to be credited to his account:")
    public void creditFlights(String name, DataTable flights) {
        List<PastFlight> requestedFlights = flights.asMaps()
            .stream()
                .map(row -> new PastFlight(
                        row.get("Flight Number"),
                        LocalDate.parse(row.get("Date")),
                        FlightStatus.valueOf(row.get("Status"))))
                .toList();
        requestedFlights.forEach(System.out::println);
    }

     */
}
        /*
        -Cucumber provides the table’s rows and cell values as a DataTable object.
        -Extracts the rows and cells as a list of maps
        -Converts each map into a PastFlight domain object
        -Returns the collection of PastFlight objects as a list
         */
