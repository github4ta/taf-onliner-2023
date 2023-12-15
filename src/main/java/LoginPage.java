import io.opentelemetry.sdk.trace.SdkTracerProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private String inputPassword ="//input[@type='password']";
    private String buttonEnter = "//div[@id='auth-container']//button[@type='submit']";
    private String textEnter = "//div[@class='auth-form__title auth-form__title_big auth-form__title_condensed-default']";
    private String textLoginError = "//*[@id='auth-container']/div/div[2]/div/form/div[1]/div/div[2]/div/div/div[2]/div";
    private String textPasswordError = "//*[@id='auth-container']/div/div[2]/div/form/div[2]/div/div/div[2]/div";
   }
