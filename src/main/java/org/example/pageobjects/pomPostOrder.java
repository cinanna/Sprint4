package org.example.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class pomPostOrder {
    private WebDriver driver;
    public By orderButton = By.xpath(".//div/button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");
    //Локатор для кнопки Далее
    private By confirmOrder = By.xpath(".//div/button[text() = 'Да']");
    // Локатор для подтвреждания заказа
    private By orderTrue = By.className("Order_ModalHeader__3FDaJ");
    //Локатор успешного заказа

    public pomPostOrder (WebDriver driver) {
        this.driver = driver;
    }

    public void confirmOrder() {
        driver.findElement(orderButton).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(confirmOrder));
        driver.findElement(confirmOrder).click();
    }

    public boolean isOrderTrue() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(orderTrue));
        boolean isOrdered = driver.findElement(orderTrue).isDisplayed();
        return isOrdered;
    }


}
