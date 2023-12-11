import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class OnlinerTest extends BaseTest {
    @Test
    public void testWithTitleForum() throws InterruptedException {
        driver.get("https://www.onliner.by/");
        ForumPage forum = new ForumPage(driver);
        forum.clickButtonForum();
        Thread.sleep(2000);
        Assertions.assertEquals("Форум", forum.getTitleText());
    }
}
