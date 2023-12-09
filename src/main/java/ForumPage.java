import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForumPage {
    String forumPageTitle = "//*[contains(@class, 'm-title')]";

    private WebDriver driver;

    public ForumPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleText() {
        return driver.findElement(By.xpath(forumPageTitle)).getText();
    }
}
