import io.opentelemetry.sdk.trace.SdkTracerProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private String inputPassword ="//input[@type='password']";
    private String buttonEnter = "//div[@id='auth-container']//button[@type='submit']";
    private String textEnter = "//div[@class='auth-form__title auth-form__title_big auth-form__title_condensed-default']";
    private String inputButtonLoginUserAccount = "//div[@class='auth-bar__item auth-bar__item--text']";
    private String titleLoginForm = "//div[@class='auth-form__title auth-form__title_big auth-form__title_condensed-default']";
    WebDriver driver;
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
