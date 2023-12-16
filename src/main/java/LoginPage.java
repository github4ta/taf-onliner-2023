import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private String inputPassword ="//input[@type='password']";
    private String buttonEnter = "//div[@id='auth-container']//button[@type='submit']";
    private String textEnter = "//div[@class='auth-form__title auth-form__title_big auth-form__title_condensed-default']";
    private String textLoginError = "//*[@id='auth-container']/div/div[2]/div/form/div[1]/div/div[2]/div/div/div[2]/div";
    private String textPasswordError = "//*[@id='auth-container']/div/div[2]/div/form/div[2]/div/div/div[2]/div";
    private String inputFieldNikName = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div";
    private String sendKeysInputFieldNikName = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/input";

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickInputFieldNikName() {
        driver.findElement(By.xpath(inputFieldNikName)).click();
    }

    public String sendKeysInputFieldNikName(String test) {
        WebElement inputFieldNikName = driver.findElement(By.xpath(sendKeysInputFieldNikName));
        inputFieldNikName.sendKeys(test);
        return inputFieldNikName.getText();
    }
   }
