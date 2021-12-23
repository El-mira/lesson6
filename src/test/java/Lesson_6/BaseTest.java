package Lesson_6;

import Lesson_6.pages.LoginPageCulture;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;
    LoginPageCulture loginPage;

    @BeforeAll
    static void beforeAll(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setupBrowser(){
        driver = new ChromeDriver();
        loginPage = new LoginPageCulture(driver);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
