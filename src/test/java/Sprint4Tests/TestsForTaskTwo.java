package Sprint4Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.example.pageobjects.pomMainPage;
import org.example.pageobjects.pomOrderPage;
import org.example.pageobjects.pomRentPage;
import org.example.pageobjects.pomPostOrder;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class TestsForTaskTwo {
    private final String name;
    private final String surname;
    private final String address;
    private final String phone;
    private WebDriver driver;
    public boolean isOrdered;

    public TestsForTaskTwo (String name, String surname, String address, String phone) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {
                { "Луффи", "Мугивара", "Москва", "88005555555"},
                { "Джорно", "Джованна", "Санкт-Петербург", "88001111111"},
        };
    }



    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }


    @Test
    public void checkOrder() {
        driver = new ChromeDriver();
        pomOrderPage orderPage = new pomOrderPage(driver);
        pomMainPage mainPage = new pomMainPage(driver);
        pomRentPage rentPage = new pomRentPage(driver);
        pomPostOrder postOrder = new pomPostOrder(driver);
        mainPage.openMainPage();
        mainPage.openOrderPage();
        orderPage.fillOrderPage(name, surname, address, phone);

        rentPage.openRentPage();
        rentPage.fillRentInfo("05.01.2023", "Без комментариев");

        postOrder.confirmOrder();

        isOrdered = postOrder.isOrderTrue();

        assertTrue("Заказ не оформлен", isOrdered);

    }

    @After
    public void endTest() {
        driver.quit();
    }
}
