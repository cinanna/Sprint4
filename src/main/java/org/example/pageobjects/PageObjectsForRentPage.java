package org.example.pageobjects;

import org.openqa.selenium.By;

public class PageObjectsForRentPage {
    public By dateRent = By.cssSelector("input[placeholder = '* Когда привезти самокат']");
    public By comment = By.cssSelector("input[placeholder = 'Комментарий для курьера']");
    public By rentTerm = By.className("Dropdown-placeholder");
    public By rentList = By.className("Dropdown-option");
    public By black = By.id("black");
    public By grey = By.id("grey");
   // public By orderButton = By.xpath("html/body/div/div/div/div/button[text() = 'Заказать']");
    public By orderButton = By.xpath(".//div/button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");
}