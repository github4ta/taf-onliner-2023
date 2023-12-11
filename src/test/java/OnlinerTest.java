import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OnlinerTest extends BaseTest {
    @Test
    public void start() throws InterruptedException{
        driver.get("https://www.onliner.by/");
        OnlinerTest onlinerTest=new OnlinerTest(driver);
        onlinerTest.clickInputButtonUslugi();
        Assertions.assertEquals("Заказы","Заказы");
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
