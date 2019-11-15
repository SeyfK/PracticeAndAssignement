package self.LocatorsTestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsWork_VyTrack_Title_Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String loginPage= "http://qa2.vytrack.com/user/login";
         driver.get(loginPage);


        //enter credentials
        // locate user name element and enter username
        WebElement loginInput = driver.findElement(By.id("prependedInput"));
        String UserName = "user33";
        loginInput.sendKeys(UserName);

        //locate the password element and enter the password
        WebElement passwordInput = driver.findElement(By.id("prependedInput2"));
        String password = "UserUser123";
        passwordInput.sendKeys(password);

        //locate element login button and click it
        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();

        //locate User menu
        WebElement userMenu = driver.findElement(By.xpath("//*[@id=\"user-menu\"]/a"));
        Thread.sleep(800);
        userMenu.click();

        //locate 'My configuration Button'
        WebElement MyPreferences = driver.findElement(By.xpath("//*[@id=\"user-menu\"]/ul/li[2]/a"));
        MyPreferences.click();


        // locate userName top right corner
        WebElement userNameRightCorner = driver.findElement(By.id("user-menu"));
        String userName = userNameRightCorner.getText();


        // locate userName in the title of the page
        Thread.sleep(1000);
        String titleUserName = driver.getTitle();


        // check if the title contains userName
        if(titleUserName.contains(userName)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("titleUserName = " + titleUserName);
            System.out.println("userName = " + userName);
        }






        Thread.sleep(2000);
       driver.quit();
    }
}