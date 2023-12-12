import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoPage {
    private String locatorMainTabAutoPageFromOnliner ="//span[contains(text(),'Автобарахолка')]";
    WebDriver driver = new ChromeDriver();

    public AutoPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitleText(){
       
        WebElement TabAutoPageFromOnlinerElement= driver.findElement(By.xpath(locatorMainTabAutoPageFromOnliner));
        String title= TabAutoPageFromOnlinerElement.getText();
        return title;
    }
}
