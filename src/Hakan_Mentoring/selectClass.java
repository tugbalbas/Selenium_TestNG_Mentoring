package Hakan_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cloud.testinsights.io/app/#!/register");

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Tugba");

        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Albas");

        driver.findElement(By.xpath("//input[@placeholder='Company']")).sendKeys("TechnoStudy");

        WebElement country=driver.findElement(By.cssSelector("select[message-id='countryMessage']"));
        Select slc=new Select(country);
        slc.selectByVisibleText("Germany");

        driver.findElement(By.name("phoneNumber")).sendKeys("0123456789");

        driver.findElement(By.xpath("//input[contains(@validator,'email')]")).sendKeys("hdhddd@gmail.com");

        driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("12345678!a");

        driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("12345678!a");

        driver.findElement(By.id("agreeCheck")).click();

        driver.findElement(By.id("marketingCheck")).click();

        driver.findElement(By.xpath("//button[@ng-click='clientRegister()']")).click();


    }
}