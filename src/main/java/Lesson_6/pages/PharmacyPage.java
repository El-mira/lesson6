package Lesson_6.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PharmacyPage extends BaseView{
    public PharmacyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='header__link' and @href='/catalog/kosmetika/']")
    public WebElement kosmetikaButton;

    @FindBy(xpath = ".//a[text()='Гели для душа']")
    public WebElement gelForShowerButton;

    @FindBy(xpath = "//a[@data-name='Биодерма Лаб Атодерм масло д/душа 1000мл']")  ////a[@data-name='Биодерма Лаб Атодерм масло д/душа 1000мл']
    public WebElement oilForShowerButton;

    @Step("Нажать на кнопку 'Косметика'")
    public PharmacyPage cosmetics(){
        kosmetikaButton.click();
        return this;
    }

    @Step("Нажать на кнопку 'Гели для душа'")
    public PharmacyPage gel(){
        gelForShowerButton.click();
        return this;
    }

    @Step("Нажать на кнопку 'Биодерма Лаб Атодерм масло д/душа 1000мл'")
    public PharmacyMainPage oil(){
        oilForShowerButton.click();
        return new PharmacyMainPage(driver);
    }
}


