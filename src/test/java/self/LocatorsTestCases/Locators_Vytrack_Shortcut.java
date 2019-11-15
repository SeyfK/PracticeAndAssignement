package self.LocatorsTestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Vytrack_Shortcut {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String loginPage = "https://qa2.vytrack.com/user/login";
        driver.get(loginPage);
        //enter credentials
        // locate user name element and enter username
        WebElement loginInput = driver.findElement(By.id("prependedInput"));
        String UserName = "salesmanager134";
        loginInput.sendKeys(UserName);

        //locate the password element and enter the password
        WebElement passwordInput = driver.findElement(By.id("prependedInput2"));
        String password = "UserUser123";
        passwordInput.sendKeys(password);
Thread.sleep(2000);
        //locate element login button and click it
        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();

        //verify that Dashboard is open
        String dashBoard = driver.getTitle();
        Thread.sleep(1000);
        if (!dashBoard.equals("Dashboard")) {
            System.out.println("Dashboard is not opened");
            driver.quit();
            return;
        }

        // locate the shortcut icon
        WebElement shortCutButton = driver.findElement(By.xpath("//*[@id=\"oroplatform-header\"]/div[1]/div/div[2]/div/a/i"));
        Thread.sleep(1000);
        shortCutButton.click();

        //click on 'see full list'
        WebElement fullListButton = driver.findElement(By.xpath("//*[@id=\"oroplatform-header\"]/div[1]/div/div[2]/div/ul/li[2]/form/div/div/a"));
        Thread.sleep(1000);
        fullListButton.click();

        //locate 'Opportunities' hyperlink
        Thread.sleep(1000);
        WebElement opportunitiesLink = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/table/tbody/tr[21]/td[1]/a"));
        opportunitiesLink.click();

        // verify that "Open Opportunities" page is open
        Thread.sleep(2000);
        String titleOpenOpportPage = driver.getTitle();
        if (!titleOpenOpportPage.contains("Open Opportunities")) {
            System.out.println("Open Opportunities page is not opened");
            driver.quit();
            return;
        }

        // click the shortcut icon
        shortCutButton = driver.findElement(By.xpath("//*[@id=\"oroplatform-header\"]/div[1]/div/div[2]/div/a/i"));
        Thread.sleep(1000);
        shortCutButton.click();
        System.out.println("Dashboard page is open");

        //click 'see full list'
        fullListButton = driver.findElement(By.xpath("//*[@id=\"oroplatform-header\"]/div[1]/div/div[2]/div/ul/li[2]/form/div/div/a"));
        Thread.sleep(1000);
        fullListButton.click();

        //locate to 'Vehicles Services Log' link and lick it
        Thread.sleep(1000);
        WebElement vehicleServiceLogLink = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/table/tbody/tr[17]/td[1]/a"));
        vehicleServiceLogLink.click();

        //Verify that error message 'You do not have permission to perform this action.' pops out
        String expectedErrorMessage = "You do not have permission to perform this action.";
        Thread.sleep(1000);
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"flash-messages\"]/div/div/div/div"));
        String actualErrorMessage = errorMessage.getText();
        if (!expectedErrorMessage.equals(actualErrorMessage)) {
            System.out.println("No error message was given");
            driver.quit();
            return;
        }

        // Verify that 'Shortcut Action List' page is open
        Thread.sleep(2000);
        String finalTitle = driver.getTitle();
        if (finalTitle.contains("Shortcut Actions List")) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }


        Thread.sleep(1000);
        driver.quit();

    }
}