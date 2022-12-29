package org.example;

import org.example.PageObjects.PageObjectsForOrderPage;
import org.example.PageObjects.PageObjectsForRentPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RentPage {
    private WebDriver driver;
    PageObjectsForOrderPage pomOrder = new PageObjectsForOrderPage();
    PageObjectsForRentPage pomRent = new PageObjectsForRentPage();

    public RentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openRentPage() {
        driver.findElement(pomOrder.buttonNext).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(pomRent.dateRent));
    }

    public void fillRentInfo(String date, String comment) {
        driver.findElement(pomRent.dateRent).sendKeys(date);
        driver.findElement(pomRent.black).click();
        driver.findElement(pomRent.rentTerm).click();
        driver.findElement(pomRent.rentList).click();
        driver.findElement(pomRent.comment).sendKeys(comment);
    }
}
