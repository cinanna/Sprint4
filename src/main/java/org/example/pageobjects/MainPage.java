package org.example.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MainPage {
    private By pagelogo = By.className("Header_LogoYandex__3TSOI");
    // Локатор для Лого

    public By button = By.id("accordion__heading-0");
    public By buttonOne = By.id("accordion__heading-1");
    public By buttonTwo = By.id("accordion__heading-2");
    public By buttonThree = By.id("accordion__heading-3");
    public By buttonFour = By.id("accordion__heading-4");
    public By buttonFive = By.id("accordion__heading-5");
    public By buttonSix = By.id("accordion__heading-6");
    public By buttonSeven = By.id("accordion__heading-7");
    //Локаторы Вопросов о важном

    public By textInButton = By.id("accordion__panel-0");
    public By textInButtonOne = By.id("accordion__panel-1");
    public By textInButtonTwo = By.id("accordion__panel-2");
    public By textInButtonThree = By.id("accordion__panel-3");
    public By textInButtonFour = By.id("accordion__panel-4");
    public By textInButtonFive = By.id("accordion__panel-5");
    public By textInButtonSix = By.id("accordion__panel-6");
    public By textInButtonSeven = By.id("accordion__panel-7");
    //Локаторы Ответоа для Вопросов о важном

    public By orderButton = By.xpath(".//div/button[@class='Button_Button__ra12g']");
    //Локатор кнопки "Заказать"

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openMainPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(pagelogo));
    }

    public String getTextInFAQ(By button, By textButton) {
        WebElement element = driver.findElement(button);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(button));
        element.click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(textButton));
        return driver.findElement(textButton).getText();
    }

    public void openOrderPage() {
        driver.findElement(orderButton).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(pagelogo));
    }
}