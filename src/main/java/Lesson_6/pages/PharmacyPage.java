package Lesson_6.pages;

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

    public PharmacyPage cosmetics(){
        kosmetikaButton.click();
        return this;
    }

    public PharmacyPage gel(){
        gelForShowerButton.click();
        return this;
    }

    public PharmacyMainPage oil(){
        oilForShowerButton.click();
        return new PharmacyMainPage(driver);
    }
}


