import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    @DisplayName("UI-0101")
    public void testInputFieldNikName() {

        driver.get("https://www.onliner.by/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickInputFieldNikName();
        loginPage.sendKeysInputFieldNikName("Ник");

    }
}
