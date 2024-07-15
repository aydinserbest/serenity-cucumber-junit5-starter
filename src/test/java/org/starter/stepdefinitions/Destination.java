package org.starter.stepdefinitions;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Destination {
    @Given("the available destinations should be:")
    public void the_available_destinations_should_be(List<String> cities) {
        for (String city : cities) {
            System.out.println(city);
        }
    }
    @Given("the following users are available:")
    public void the_following_users_are_available(List<Map<String, Object>> users) {

        for (Map<String, Object> user : users) {
            System.out.println(user);
        }
    }
    @ParameterType(name = "string-values", value = "(.*)")
    public List<String> stringValues(String destinationList) {
        return Stream.of(destinationList.split(","))
                 .map(String::trim)
                 .collect(Collectors.toList());
    }
    @Then("the available destinations should be {string-values}")
    public void availableDestinations(List<String> destinations) {
        for (String destination : destinations) {
            System.out.println(destination);
        }
    }

}

/*
Tablodaki her satırı bir List elemanı olarak temsil edebiliriz.
Bu durumda, elimizde şu şekilde bir liste olur:
["Berlin", "Paris", "New York"]

Bu list:

İlk eleman olarak "Berlin",
İkinci eleman olarak "Paris",
Üçüncü eleman olarak "New York" içerir.

 */
/*
Bu metod, Cucumber tarafından çalıştırıldığında, cities parametresi ["Berlin", "Paris", "New York"] şeklinde bir liste olur.

List<String>: Java'da List bir koleksiyondur, yani birden fazla değeri tutar.
String: Bu listenin her bir elemanı String türündedir, yani metin/veri tipindedir.
 */
/*
Cucumber, feature dosyasındaki tabloyu alır ve bunu bir List<String> nesnesine dönüştürür.
Bu, Cucumber'ın içindeki bir mekanizma sayesinde otomatik olarak yapılır.

List<String> cities: Bu parametre, feature dosyasındaki tablodaki verileri alır.
Cucumber, tabloyu bir liste olarak bu parametreye geçirir.

Cucumber, Tablo verilerini List<String> olarak dönüştürdü:

| Berlin | -> "Berlin"
| Paris | -> "Paris"
| New York| -> "New York"
Bu veriler, bir liste içinde toplandı: ["Berlin", "Paris", "New York"]

Metod çalıştırıldığında bu liste parametre olarak geçti:

cities parametresi, ["Berlin", "Paris", "New York"] listesine sahip oldu.
 */