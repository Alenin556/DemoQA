import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class test {

    private static WebDriver driver;
    private static Page page;


    @BeforeAll
    // Перед началом написания тестов, инициализируем драйвер для взаимодействия с браузером.
    // Инициализация (от англ. initialization, инициирование) — создание, подключение, активация, подготовка к работе, определение параметров.
    static void setUpAll() {
        System.setProperty("webdriver.chrome.driver", "C:\\Java Works\\Netology Homeworks\\SeleniumPracticeMaven1\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options); //добавляем драйверу опции и методы по взаимодействию с объектами
        driver.getWindowHandle(); // опция для проведения тестов в открытом окне браузера

        // присваиваем переменной mainPage, объект класса MainPage, для взаимодействия с вебэлементами класса
        page = new Page(driver);
    }

    @BeforeEach
    void connect() {
        driver.get("https://demoqa.com/text-box");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

//    @BeforeEach
//    void connect() {
//        driver.get("http://172.17.1.45:8081/login");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }

    @Test
    public void test() {
        String fieldName = "Ilya";
        String fieldEmail = "pichugin.lua@yandex.ru";
        String fieldCurrentAdr = "Проспект Ленина";
        String fieldPermamentAdr = "Проспект Лиги";
        page.fieldName.click();
        page.fieldName.sendKeys(fieldName);

//        String fieldName = "Ilya";
//        String fieldEmail = "pichugin.lua@yandex.ru";
//        String fieldCurrentAdr = "Проспект Ленина";
//        String fieldPermamentAdr = "Проспект Лиги";
//        page.createTextBox(fieldName, fieldEmail, fieldCurrentAdr, fieldPermamentAdr);
    }

    @Test
    public void test1() {
        String fieldName = "Ilya";
        page.fieldName.sendKeys(fieldName);
    }

    @Test
    public void test2() {
        String fieldClientPhone = "1234567";
        page.fieldPhone.sendKeys(fieldClientPhone);
    }


}


