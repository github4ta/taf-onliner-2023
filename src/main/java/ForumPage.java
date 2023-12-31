import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForumPage {
    String forumPageTitle = "//*[contains(@class, 'm-title')]";
    String buttonForumLocator = "//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[7]/a/span";

    private WebDriver driver;

    public ForumPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleText() {
        return driver.findElement(By.xpath(forumPageTitle)).getText();
    }

    public void clickButtonForum() {driver.findElement(By.xpath(buttonForumLocator)).click();
    }
}
