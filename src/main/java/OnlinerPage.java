import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlinerPage {
    WebDriver driver;

    public OnlinerPage(WebDriver driver) {
        this.driver = driver;
    }

    private String url = ("https://www.onliner.by/");
    private String copyRightFooter = "//div[@class='footer-style__copy']";

    public String getCopyRightFooter() {
        return driver.findElement(By.xpath(copyRightFooter)).getText();
    }
}