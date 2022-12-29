package org.example;

import org.example.PageObjects.PageObjectsForMainPage;
import org.example.PageObjects.PageObjectsForOrderPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage {

    private WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
    PageObjectsForMainPage pom = new PageObjectsForMainPage();
    PageObjectsForOrderPage pomOrder = new PageObjectsForOrderPage();

    public void openOrderPage() {
        driver.findElement(pom.orderButton).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(pom.pagelogo));
    }

    public void fillOrderPage(String name, String surname, String address, String phone) {

        driver.findElement(pomOrder.name).sendKeys(name);
        driver.findElement(pomOrder.surname).sendKeys(surname);
        driver.findElement(pomOrder.address).sendKeys(address);
        driver.findElement(pomOrder.metro).click();
        driver.findElement(pomOrder.metroList).click();
        driver.findElement(pomOrder.phone).sendKeys(phone);
    }
}
