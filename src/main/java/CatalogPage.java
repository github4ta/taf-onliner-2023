import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogPage {
    private String catalogTitle = "//div[@class='catalog-navigation__title']";
    private WebDriver driver;

    public CatalogPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleText() {
        return driver.findElement(By.xpath(catalogTitle)).getText();
    }
}
