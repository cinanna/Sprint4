package org.example.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class pomRentPage {
    private WebDriver driver;
    private By dateRent = By.cssSelector("input[placeholder = '* Когда привезти самокат']");
    private By commentField = By.cssSelector("input[placeholder = 'Комментарий для курьера']");
    private By rentTerm = By.className("Dropdown-placeholder");
    private By rentList = By.className("Dropdown-option");
    private By black = By.id("black");
    private By grey = By.id("grey");
    // private By orderButton = By.xpath("html/body/div/div/div/div/button[text() = 'Заказать']");
    private By orderButton = By.xpath(".//div/button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");
    private By buttonNext = By.xpath(".//button[text()='Далее']");

    public pomRentPage (WebDriver driver) {
        this.driver = driver;
    }

    public void openRentPage() {
        driver.findElement(buttonNext).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(dateRent));
    }

    public void fillRentInfo(String date, String comment) {
        driver.findElement(dateRent).sendKeys(date);
        driver.findElement(black).click();
        driver.findElement(rentTerm).click();
        driver.findElement(rentList).click();
        driver.findElement(commentField).sendKeys(comment);
    }
}
