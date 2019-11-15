package self.LocatorsTestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Locators_Google_Result_Title {
    public static void main(String[] args) throws InterruptedException {


        List<String> searchStrs = Arrays.asList("Java", "JUnit", "Selenium");

       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        for (int i = 0; i < searchStrs.size(); i++) {
            //locate the google search box
            WebElement googleSearchBox = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
            googleSearchBox.sendKeys(searchStrs.get(i));
            Thread.sleep(1000);

            //locate google search button
            WebElement googleSearchButton = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]"));
            googleSearchButton.click();

            //locate the first link from the result page, save it, click on it
            WebElement resultLink;
            if (i == searchStrs.size() - 1) {
                resultLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/div/cite"));
            } else {
                resultLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/div/cite"));
            }
            String expectedUrl = resultLink.getText();
            resultLink.click();

            //save the url after navigating to it
            String actualUrl = driver.getCurrentUrl();

            //compare 2 urls
            if (actualUrl.equals(expectedUrl)) {
                System.out.println("Test" + (i +1) + " PASS");
            } else {
                System.out.println("Test" + (i + 1) + " FAIL");
                System.out.println("actualUrl = " + actualUrl);
                System.out.println("expectedUrl = " + expectedUrl);
            }

            if (i < searchStrs.size() - 1) {
                driver.navigate().back();
                driver.navigate().back();
            }

        }
        Thread.sleep(1000);
        driver.quit();

    }




}
