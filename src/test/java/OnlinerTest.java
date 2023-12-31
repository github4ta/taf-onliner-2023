
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerTest extends BaseTest {
    @Test
    public void testServiceUslugi() {
        driver.get("https://www.onliner.by/");
        OnlinerPage onlinerPage = new OnlinerPage(driver);
        onlinerPage.clickInputButtonUslugi();
        ServicePage servicePage = new ServicePage(driver);
        Assertions.assertEquals("Заказы", servicePage.getTitleText());
    }

    @Test
    public void testBaraholkaPageOpened() {
        driver.get("https://www.onliner.by/");
        OnlinerPage onlinerPage = new OnlinerPage(driver);
        onlinerPage.clickInputButtonBaraholka();
        BaraholkaPage baraholkaPage = new BaraholkaPage(driver);
        Assertions.assertEquals("Барахолка", baraholkaPage.getTitleText());
    }

    @Test
    public void testFooterSite() {
        driver.get("https://www.onliner.by/");
        OnlinerPage onlinerPage = new OnlinerPage(driver);
        onlinerPage.getCopyRightFooter();
        Assertions.assertEquals("© 2001—2023 Onlíner", onlinerPage.getCopyRightFooter());
    }

    @Test
    public void testWithTitleForum() throws InterruptedException {
        driver.get("https://www.onliner.by/");
        ForumPage forum = new ForumPage(driver);
        forum.clickButtonForum();
        Thread.sleep(2000);
        Assertions.assertEquals("Форум", forum.getTitleText());
    }

    @Test
    public void testTextFooter(){
        driver.get("https://www.onliner.by/");
        WebElement footer = driver.findElement(By.xpath("/html/body/div[4]/footer/div/div/div/div[2]/div[2]"));
        String actualfooter = footer.getText();
        Assertions.assertEquals("© 2001—2023 Onlíner", actualfooter);
    }

}
