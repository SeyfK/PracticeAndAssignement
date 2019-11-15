package self.LocatorsTestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TestCase_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://amazon.com");
        String searchWord = "java";
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java"+ Keys.ENTER);
String searchBotton = driver.getTitle();
if(searchBotton.contains(searchWord)){
    System.out.println("Amazon Pass");
}else {
    System.out.println("Amazon Fail");
}

Thread.sleep(2000);

driver.navigate().to("https://ebay.com");
String seachWord2 = "java";
driver.findElement(By.id("gh-ac")).sendKeys("java"+Keys.ENTER);
String searchButton2 = driver.getTitle();

if (searchButton2.contains(seachWord2)){
    System.out.println("Ebay Pass");
}else {
    System.out.println("Ebay Fail");
}


Thread.sleep(2000);
driver.quit();


    }
}
