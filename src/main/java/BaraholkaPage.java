import org.openqa.selenium.WebDriver;

public class BaraholkaPage {
    private String enterTitle = "//h1[@class='m-title-i']";
    private WebDriver driver;

    public BaraholkaPage(WebDriver driver) {
        this.driver = driver;
    }

}
