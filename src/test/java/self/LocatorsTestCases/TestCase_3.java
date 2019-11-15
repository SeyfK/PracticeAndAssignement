package self.LocatorsTestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver"+ Keys.ENTER);
driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[3]/ul/li[1]/div[1]/a")).click();
Thread.sleep(1000);
String currentUr = driver.getCurrentUrl();
if (currentUr.endsWith("Selenium_(software)")){
    System.out.println("Pass");
}else {
    System.out.println("Fail");
}

        Thread.sleep(1000);
driver.quit();



    }

}
