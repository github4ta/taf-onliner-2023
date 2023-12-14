import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogPage {
    private String catalogTitle = "//div[@class='catalog-navigation__title']";
    private String linkElectronics = "//li[@data-id='1']";
    private String linkComputersAndNetworks = "//li[@data-id='2']";
    private String linkHomeAppliances = "//li[@data-id='3']";
    private String linkForEveryDay = "//li[@data-id='9']";
    private String linkConstructionAndRepair = "//li[@data-id='4']";
    private String linkHouseAndGarden = "//li[@data-id='5']";
    private String linkCarsAndMotorcycles = "//li[@data-id='6']";
    private String linkBeautyAndSports = "//li[@data-id='7']";
    private String linkForChildrenAndMothers = "//li[@data-id='8']";
    private WebDriver driver;

    public CatalogPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleText() {
        return driver.findElement(By.xpath(catalogTitle)).getText();
    }

    public void clickLinkElectronics() {
        driver.findElement(By.xpath(linkElectronics)).click();
    }

    public void clickLinkComputersAndNetworks() {
        driver.findElement(By.xpath(linkComputersAndNetworks)).click();
    }

    public void clickLinkHomeAppliances() {
        driver.findElement(By.xpath(linkHomeAppliances)).click();
    }

    public void clickLinkForEveryDay() {
        driver.findElement(By.xpath(linkForEveryDay)).click();
    }

    public void clickLinkConstructionAndRepair() {
        driver.findElement(By.xpath(linkConstructionAndRepair)).click();
    }

    public void clickLinkHouseAndGarden() {
        driver.findElement(By.xpath(linkHouseAndGarden)).click();
    }

    public void clickLinkCarsAndMotorcycles() {
        driver.findElement(By.xpath(linkCarsAndMotorcycles)).click();
    }

    public void clickLinkBeautyAndSports() {
        driver.findElement(By.xpath(linkBeautyAndSports)).click();
    }

    public void clickLinkForChildrenAndMothers() {
        driver.findElement(By.xpath(linkForChildrenAndMothers)).click();
    }

}
