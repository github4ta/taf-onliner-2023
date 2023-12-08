public class OnlinerPage {
    private String Url = ("https://www.onliner.by/");
    private String copyRightFooter = "//div[@class='footer-style__copy']";

    public String getUrl() {
        driver.get(Url);

        public String getCopyRightFooter () {
            return driver.findElement(By.xpath(copyRightFooter));
        }
    }
}