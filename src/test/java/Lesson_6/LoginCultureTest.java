package Lesson_6;

import Lesson_6.pages.LoginPageCulture;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Lesson_6.Configuration.BASE_URL;

public class LoginCultureTest extends BaseTest{
    @BeforeEach
    public void goToPage() {
        driver.get(BASE_URL);
    }

    @Test  // первый вариант
    void loginTest() {
        loginPage.buttonEmail.click();
        loginPage.inputLogin.sendKeys("ivanych19.77@mail.ru");
        loginPage.inputPassword.sendKeys("daulmirra2014");
        loginPage.buttonSubmit.click();
    }

    @Test // второй вариант
    void loginTestLazyPage() {
        new LoginPageCulture(driver)
                .buttonEmail()
                .fillInputLogin("ivanych19.77@mail.ru")
                .fillInputPassword("daulmirra2014")
                .buttonSubmit();
    }
}
