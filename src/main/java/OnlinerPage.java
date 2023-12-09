import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlinerPage {
    WebDriver driver;
    private final String inputButtonKatalog = "//a[@class='b-main-navigation__advert b-main-navigation__advert_primary']";
    private final String inputButtonAutobaraholka = "//a[@href='https://ab.onliner.by']//span[@class='b-main-navigation__text']";
    private final String inputButtonUslugi = "//a[@href='https://s.onliner.by/tasks']//span[@class='b-main-navigation__text']";
    private final String inputButtonBaraholka = "//a[@href='https://baraholka.onliner.by/']//span[@class='b-main-navigation__text']";
    private final String inputButtonForum = "//a[@href='https://forum.onliner.by/']//span[@class='b-main-navigation__text']";
    private final String url = ("https://www.onliner.by/");
    private final String copyRightFooter = "//div[@class='footer-style__copy']";
    public OnlinerPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCopyRightFooter() {
        return driver.findElement(By.xpath(copyRightFooter)).getText();
    }

    public void clickInputButtonKatalog() {

        driver.findElement(By.xpath(inputButtonKatalog)).click();
    }

    public void clickInputButtonAutobaraholka() {

        driver.findElement(By.xpath(inputButtonAutobaraholka)).click();
    }

    public void clickInputButtonUslugi() {

        driver.findElement(By.xpath(inputButtonUslugi)).click();
    }

    public void clickInputButtonBaraholka() {

        driver.findElement(By.xpath(inputButtonBaraholka)).click();
    }

    public void clickInputButtonForum() {

        driver.findElement(By.xpath(inputButtonForum)).click();
    }

}

