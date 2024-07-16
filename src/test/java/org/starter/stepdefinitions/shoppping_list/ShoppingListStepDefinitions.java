package org.starter.stepdefinitions.shoppping_list;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

import java.util.Arrays;
import java.util.List;

public class ShoppingListStepDefinitions {
    @Then("my shopping list should contain:")
    public void myShoppingListShouldContain(DataTable dataTable) {
        List<String> shoppinglist = dataTable.asList();
        //System.out.println(shoppinglist);
        //shoppingList nesnesinin toString() metodunu çağırır ve listeyi tek bir satırda yazdırır.
        //Bu çıktı, liste öğelerini köşeli parantezler içinde ve virgülle ayrılmış olarak gösterir.
        //Liste öğelerinin bireysel olarak değil, toplu olarak tek bir satırda yazdırılması anlamına gelir.
        shoppinglist.forEach(System.out::println);
        //listenin her öğesini ayrı bir satıra yazdırır.
        //Bu çıktı, liste öğelerinin her birini ayrı satırlarda gösterir.
        //Liste öğelerini daha okunabilir ve anlaşılır bir şekilde yazdırır.
        //Her öğe ayrı bir println çağrısıyla yazdırıldığı için, özellikle büyük listelerde daha okunabilir ve analiz edilebilir bir çıktı sağlar.
    }
    public static void main(String[] args) {
        List<String> shoppingList = Arrays.asList("Onions", "Potatoes", "Sausages", "Apples", "Relish");

        // Tek satırda yazdırır
        System.out.println(shoppingList);

        // Her öğeyi ayrı satırlara yazdırır
        shoppingList.forEach(System.out::println);
    }
}
