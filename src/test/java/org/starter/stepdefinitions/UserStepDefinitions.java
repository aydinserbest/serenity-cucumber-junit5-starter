package org.starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

public class UserStepDefinitions {

    @Given("these Users:")
    public void aUserNamed(DataTable dataTable) {
        List<Map<String, String>> users = dataTable.asMaps();

        // Tarih biçimlendirme
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");

        for (Map<String, String> user : users) {
            String name = user.get("name");
            LocalDate dateOfBirth = LocalDate.parse(user.get("date of birth"), formatter);

            // Kullanıcıyı yazdırma
            System.out.println("Name: " + name + ", Date of Birth: " + dateOfBirth);

        }
    }
}
//date formatter kullanmadan sout soyle yazardi:
// date of birth=August 29, 1958}

//date formatter ile:
// Date of Birth: 1958-08-29
