import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServicePage {
    private String tasksTitle = "//*[@id=\"service-list\"]/div[1]/div/div/div/div[1]/div";

    private WebDriver driver;

    public ServicePage(WebDriver driver) {this.driver = driver;}

    public String getTitleText() {return  driver.findElement(By.xpath(tasksTitle)).getText();}

}
