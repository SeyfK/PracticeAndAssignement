package self.LocatorsTestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsWork_Etsy_Search {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://ebay.com");
        //locate ebay search box
        WebElement searchBox  = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("wooden spoon");

        //locate search button
        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();

        //locate 1st search result number
        WebElement numberOfresults = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div/div[1]/h1/span[1]"));
        String SearchResult1 = numberOfresults.getText().replace(",","");
        Integer search1 = Integer.parseInt(SearchResult1);


        //locate link 'All' and click it
        WebElement allLink = driver.findElement(By.linkText("All"));
        allLink.click();

        Thread.sleep(1000);
        //locate 2nd search result number
        WebElement numberOfresult2 = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div/div[1]/h1/span[1]"));
        String SearchResult2 = numberOfresult2.getText().replace(",","");
        Integer search2 = Integer.parseInt(SearchResult2);


        //compare 2 results
       if(search1<search2){
           System.out.println("PASS");
       }else
       {
           System.out.println("FAIL");
           System.out.println("search result 1: "+search1);
           System.out.println("search result 2: "+search2);

       }
        Thread.sleep(2000);
        driver.quit();

    }

}
