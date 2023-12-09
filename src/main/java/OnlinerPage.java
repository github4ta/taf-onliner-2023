import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerPage {
   private String url = "https://www.onliner.by/";
    private String copyRightFooter = "//div[@class='footer-style__copy']";
    private WebDriver driver;

    public String getUrl() {
        driver.get(url);

        public String getCopyRightFooter() {
            return String.valueOf(driver.findElement(By.xpath(copyRightFooter)));
        }
    }

    public OnlinerPage(WebDriver driver) {
        this.driver = driver;
    }
}