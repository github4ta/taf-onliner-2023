import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OnlinerTest extends BaseTest {
    @Test
        public void testServiceUslugi() {
        driver.get("https://www.onliner.by/");
        OnlinerPage onlinerPage = new OnlinerPage(driver);
        onlinerPage.clickInputButtonUslugi();
        ServicePage servicePage=new ServicePage(driver);
        Assertions.assertEquals("Заказы",servicePage.getTitleText());
    }

    @Test
    public void testBaraholkaPageOpened() {
        driver.get("https://www.onliner.by/");
        OnlinerPage onlinerPage = new OnlinerPage(driver);
        onlinerPage.clickInputButtonBaraholka();
        BaraholkaPage baraholkaPage = new BaraholkaPage(driver);
        Assertions.assertEquals("Барахолка", baraholkaPage.getTitleText());
    }

}
