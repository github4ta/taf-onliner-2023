import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class OnlinerTest extends BaseTest {
    @Test
    public void testFooterSite() {
        driver.get("https://www.onliner.by/");
        OnlinerPage onlinerPage = new OnlinerPage(driver);
        onlinerPage.getCopyRightFooter();
        Assertions.assertEquals("© 2001—2023 Onlíner", onlinerPage.getCopyRightFooter());
    }

}
