package Lesson_6;

import Lesson_6.pages.PharmacyPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Lesson_6.Configuration.BASE_URL2;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.hasText;

@Feature("Тестирование выбора и добавления позиции в корзину")
public class PharmacyTest extends BaseTest{

    @BeforeEach
    public void goToPage() {
        driver.get(BASE_URL2);
    }

    @Test
    void connectTestLazyPage() {
        new PharmacyPage(driver)
                .cosmetics()
                .gel()
                .oil();
        assertTrue(driver.findElement(By.xpath("//a[@data-name='Биодерма Лаб Атодерм масло д/душа 1000мл']")).isDisplayed());
        List<WebElement> headers = driver.findElements(
                By.xpath("//a[@data-name='Биодерма Лаб Атодерм масло д/душа 1000мл']"));
        System.out.println(headers.get(0).getText());

        List<WebElement> headers1 = driver.findElements(
                By.xpath("//a[@class='header__link' and @href='/catalog/kosmetika/']"));
        System.out.println(headers1.get(0).getText());

        assertAll(() -> {
            assertTrue(headers.get(0).isDisplayed());
            assertEquals(headers.get(0).getText(), "В КОРЗИНЕ");
            assertThat(headers1.get(0), hasText("Косметика"));
        });
    }
}
