package Hakan_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waits2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.id("title")).sendKeys("deneme deneme");
        driver.findElement(By.id("description")).sendKeys("explicityWait denemesi");
        driver.findElement(By.id("btn-submit")).click();

        // "form submitted successfully!" yazısını göresiye kadar bekletmek için;
        WebDriverWait wait=new WebDriverWait(driver,10); // Boolean döndürür UNUTMA!
        Boolean y=wait.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Successfully!"));

        System.out.println(y);

        driver.quit();
    }
}
