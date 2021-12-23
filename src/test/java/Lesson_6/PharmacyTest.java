package Lesson_6;

import Lesson_6.pages.PharmacyPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Lesson_6.Configuration.BASE_URL2;

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
    }
}
