package org.example.PageObjects;

import org.openqa.selenium.By;

public class PageObjectsForMainPage {

    public By pagelogo = By.className("Header_LogoYandex__3TSOI");
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

    public By orderButton = By.xpath("html/body/div/div/div/div/div/button[@class='Button_Button__ra12g']");
    //Локатор кнопки "Заказать"
}
