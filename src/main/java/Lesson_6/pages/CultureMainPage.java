package Lesson_6.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CultureMainPage extends BaseView{

    public CultureMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@title='Логотип Культура.рф'']")
    public WebElement cultureLogoButton;
    }
