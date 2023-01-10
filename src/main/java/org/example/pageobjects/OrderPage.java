package org.example.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private WebDriver driver;
    private By nameField = By.cssSelector("input[placeholder = '* Имя']");
    //Локатор для ввода имени
    private By surnameField = By.cssSelector("input[placeholder = '* Фамилия']");
    //Локатор для ввода Фамилии
    private By addressField = By.cssSelector("input[placeholder = '* Адрес: куда привезти заказ']");
    //локатор для ввода адреса
    private By metro = By.cssSelector("input[placeholder = '* Станция метро']");
    //Локатор для ввода станции метро
    private By metroList = By.className("select-search__select");
    //Локатор для выбора из списка метро
    private By phoneField = By.cssSelector("input[placeholder = '* Телефон: на него позвонит курьер']");
    //Локатр для номера телефонв

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillOrderPage(String name, String surname, String address, String phone) {

        driver.findElement(nameField).sendKeys(name);
        driver.findElement(surnameField).sendKeys(surname);
        driver.findElement(addressField).sendKeys(address);
        driver.findElement(metro).click();
        driver.findElement(metroList).click();
        driver.findElement(phoneField).sendKeys(phone);
    }
}