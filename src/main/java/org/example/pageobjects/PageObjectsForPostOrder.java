package org.example.pageobjects;

import org.openqa.selenium.By;

public class PageObjectsForPostOrder {
    public By confirmOrder = By.xpath(".//div/button[text() = 'Да']");
    public By orderTrue = By.className("Order_ModalHeader__3FDaJ");
}
