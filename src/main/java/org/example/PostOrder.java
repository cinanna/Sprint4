package org.example;

import org.example.pageobjects.PageObjectsForPostOrder;
import org.example.pageobjects.PageObjectsForRentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PostOrder {
    PageObjectsForPostOrder pomPost = new PageObjectsForPostOrder();

    private WebDriver driver;
    PageObjectsForRentPage pomRent = new PageObjectsForRentPage();

    public PostOrder(WebDriver driver) {
        this.driver = driver;
    }

    public void confirmOrder() {
        driver.findElement(pomRent.orderButton).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(pomPost.confirmOrder));
        driver.findElement(pomPost.confirmOrder).click();
    }

    public boolean isOrderTrue() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Order_ModalHeader__3FDaJ")));
        boolean isOrdered = driver.findElement(By.className("Order_ModalHeader__3FDaJ")).isDisplayed();
        return isOrdered;
    }
}
