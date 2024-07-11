package org.starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class CucumberSteps {
    private int bellyCucumbers;
    private int stomachCucumbers;

    //@Given("I have {int} cucumber(s) in my belly/stomach")
    //@Given("^I have (42|1|44) (?:cucumber|cucumbers) in my (belly|stomach)$")
    //@Given("^I have (42|1|44) cucumber(?:s)? in my (belly|stomach)$")
    //@Given("^I have (\\d+) cucumber(?:s)? in my (belly|stomach)$")
    @Given("^I have (\\d+) cucumbers? in my (belly|stomach)$") //cucumbers?: cucumber veya cucumbers kelimelerini yakalar. ? karakteri, önceki karakterin (bu durumda 's') sıfır veya bir kez geçebileceğini belirtir.
//(belly|stomach): 'belly' veya 'stomach' kelimelerini yakalar.
    public void i_have_cucumbers_in_my_body(int count, String location) {
        if (location.equals("belly")) {
            bellyCucumbers = count;
        } else if (location.equals("stomach")) {
            stomachCucumbers = count;
        }
    }

    @When("I eat {int} cucumber(s)")
    public void i_eat_cucumber(int count) {
        bellyCucumbers -= count;
        stomachCucumbers += count;
    }
    /*
        //@Given("I have {int} cucumber(s) in my belly/stomach")
// {int} yer tutucusu, tam sayı değerini yakalar. 'cucumber(s)' ile tekil veya çoğul durumu kontrol eder.

//@Given("^I have (42|1|44) (?:cucumber|cucumbers) in my (belly|stomach)$")
// (42|1|44) belirli üç değerden birini yakalar: 42, 1 veya 44.
// (?:cucumber|cucumbers) non-capturing group, 'cucumber' veya 'cucumbers' ifadelerini yakalar, fakat bu grubu yakalamaz.
// (belly|stomach) 'belly' veya 'stomach' kelimelerini yakalar.

//@Given("^I have (42|1|44) cucumber(?:s)? in my (belly|stomach)$")
// (42|1|44) belirli üç değerden birini yakalar: 42, 1 veya 44.
// cucumber(?:s)? 'cucumber' veya 'cucumbers' ifadelerini yakalar.
// (belly|stomach) 'belly' veya 'stomach' kelimelerini yakalar.

@Given("^I have (\\d+) cucumber(?:s)? in my (belly|stomach)$")
// (\\d+) bir veya daha fazla rakamı yakalar.
// cucumber(?:s)? 'cucumber' veya 'cucumbers' ifadelerini yakalar.
// (belly|stomach) 'belly' veya 'stomach' kelimelerini yakalar.

     */

    @When("I add {int} more cucumber to my belly")
    public void i_add_more_cucumber_to_my_belly(int additionalCount) {
        bellyCucumbers += additionalCount;
    }

    @Then("I should have {int} cucumbers in my body")
    public void i_should_have_cucumbers_in_my_body(int totalCount) {
        int totalCucumbers = bellyCucumbers + stomachCucumbers;
        assertEquals(totalCount, totalCucumbers);
    }
}
