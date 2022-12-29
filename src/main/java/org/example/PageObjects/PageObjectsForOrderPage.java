package org.example.PageObjects;
import org.openqa.selenium.By;

public class PageObjectsForOrderPage {
    public By name = By.cssSelector("input[placeholder = '* Имя']");
    //Локатор для ввода имени
    public By surname = By.cssSelector("input[placeholder = '* Фамилия']");
    //Локатор для ввода Фамилии
    public By address = By.cssSelector("input[placeholder = '* Адрес: куда привезти заказ']");
    //локатор для ввода адреса
    public By metro = By.cssSelector("input[placeholder = '* Станция метро']");
    //Локатор для ввода станции метро
    public By metroList = By.className("select-search__select");
    //Локатор для выбора из списка метро
    public By phone = By.cssSelector("input[placeholder = '* Телефон: на него позвонит курьер']");
    //Локатр для номера телефонв
    public By buttonNext = By.xpath(".//button[text()='Далее']");
    //Локатор для кнопки Далее
}

