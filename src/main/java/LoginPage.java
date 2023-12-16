import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    private String inputPassword = "//input[@type='password']";
    private String buttonEnter = "//div[@id='auth-container']//button[@type='submit']";
    private String textEnter = "//div[@class='auth-form__title auth-form__title_big auth-form__title_condensed-default']";
    private String inputButtonLoginUserAccount = "//div[@class='auth-bar__item auth-bar__item--text']";
    private String titleLoginForm = "//div[@class='auth-form__title auth-form__title_big auth-form__title_condensed-default']";
    private String textLoginError = "//*[@id='auth-container']/div/div[2]/div/form/div[1]/div/div[2]/div/div/div[2]/div";
    private String textPasswordError = "//*[@id='auth-container']/div/div[2]/div/form/div[2]/div/div/div[2]/div";

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
