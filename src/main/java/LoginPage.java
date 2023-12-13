import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    private final String inputPassword = "//input[@type='password']";
    private final String buttonEnter = "//div[@id='auth-container']//button[@type='submit']";
    private final String textEnter = "//div[@class='auth-form__title auth-form__title_big auth-form__title_condensed-default']";
    private final String inputButtonLoginUserAccount = "//div[@class='auth-bar__item auth-bar__item--text']";
    private final String titleLoginForm = "//div[@class='auth-form__title auth-form__title_big auth-form__title_condensed-default']";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickInputButtonLoginUserAccount() {
        driver.findElement(By.xpath(inputButtonLoginUserAccount)).click();
    }

    public String getTitleLoginForm() {
        return driver.findElement(By.xpath(titleLoginForm)).getText();
    }
}
