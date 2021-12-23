package Lesson_6.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PharmacyMainPage extends BaseView{
    public PharmacyMainPage(WebDriver driver) {
        super(driver);
    }

      @FindBy(xpath = "//a[@class='logo']")
      public WebElement pharmacyLogo;
}
