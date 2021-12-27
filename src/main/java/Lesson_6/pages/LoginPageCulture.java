package Lesson_6.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageCulture extends BaseView{

    public LoginPageCulture(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='E-mail']")
    public WebElement buttonEmail;

    @FindBy( id = "login")
    public WebElement inputLogin;

    @FindBy( id = "password")
    public WebElement inputPassword;

    @FindBy( xpath = "//div[text()='Войти']")
    public WebElement buttonSubmit;

    public LoginPageCulture buttonEmail(){
        buttonEmail.click();
        return this;
    }

    @Step("Заполнить поле логин")
    public LoginPageCulture fillInputLogin(String login){
        inputLogin.sendKeys(login);
        return this;
    }

    @Step("Заполнить поле пароль")
    public LoginPageCulture fillInputPassword(String password){
        inputPassword.sendKeys(password);
        return this;
    }

    @Step("Нажать на кнопку 'войти'")
    public CultureMainPage buttonSubmit(){
        buttonSubmit.click();
        return new CultureMainPage(driver);
    }
}
