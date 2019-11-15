package self.LocatorsTestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://ebay.com");
        driver.findElement(By.id("gh-ac")).sendKeys("selenium"+ Keys.ENTER);
    String counting = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div/div[1]/h1/span[1]")).getText();
      counting= counting.replace(",", "");
        System.out.println(counting);
        Thread.sleep(2000);
        driver.quit();
    }

}
