package Sprint4Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pageobjects.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class TestsForTaskOne {
    private WebDriver driver;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void checkFirstFAQ() {
        String expectedTextOne = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        MainPage pom = new MainPage(driver);
        pom.openMainPage();
        String result = pom.getTextInFAQ(pom.button, pom.textInButton);
        assertEquals("Не совпадает текст", expectedTextOne, result);
    }

    @Test
    public void checkSecondFAQ() {
        String expectedTextTwo = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        MainPage pom = new MainPage(driver);
        pom.openMainPage();
        String result = pom.getTextInFAQ(pom.buttonOne, pom.textInButtonOne);
        assertEquals("Не совпадает текст", expectedTextTwo, result);
    }

    @Test
    public void checkThirdFAQ() {
        String expectedTextThree = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        MainPage pom = new MainPage(driver);
        pom.openMainPage();
        String result = pom.getTextInFAQ(pom.buttonTwo, pom.textInButtonTwo);
        assertEquals("Не совпадает текст", expectedTextThree, result);
    }

    @Test
    public void checkFourFAQ() {
        String expectedTextFour = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        MainPage pom = new MainPage(driver);
        pom.openMainPage();
        String result = pom.getTextInFAQ(pom.buttonThree, pom.textInButtonThree);
        assertEquals("Не совпадает текст", expectedTextFour, result);
    }

    @Test
    public void checkFiveFAQ() {
        String expectedTextFive = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        MainPage pom = new MainPage(driver);
        pom.openMainPage();
        String result = pom.getTextInFAQ(pom.buttonFour, pom.textInButtonFour);
        assertEquals("Не совпадает текст", expectedTextFive, result);
    }

    @Test
    public void checkSixFAQ() {
        String expectedTextSix = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        MainPage pom = new MainPage(driver);
        pom.openMainPage();
        String result = pom.getTextInFAQ(pom.buttonFive, pom.textInButtonFive);
        assertEquals("Не совпадает текст", expectedTextSix, result);
    }

    @Test
    public void checkSevenFAQ() {
        String expectedTextSeven = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        MainPage pom = new MainPage(driver);
        pom.openMainPage();
        String result = pom.getTextInFAQ(pom.buttonSix, pom.textInButtonSix);
        assertEquals("Не совпадает текст", expectedTextSeven, result);
    }

    @Test
    public void checkEightFAQ() {
        String expectedTextEight = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        MainPage pom = new MainPage(driver);
        pom.openMainPage();
        String result = pom.getTextInFAQ(pom.buttonSeven, pom.textInButtonSeven);
        assertEquals("Не совпадает текст", expectedTextEight, result);
    }

    @After
    public void endTest() {
        driver.quit();
    }
}