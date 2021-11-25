package Hakan_Mentoring;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _8_alertWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.demo.guru99.com/test/delete_customer.php");

        WebElement customerID=driver.findElement(By.name("cusid"));
        customerID.sendKeys("hd123");

        WebElement submitButton=driver.findElement(By.xpath("//input[@name='submit']"));
        submitButton.click();

        Thread.sleep(500);
        driver.switchTo().alert().accept();

        Assert.assertEquals("Customer Successfully Delete!",driver.switchTo().alert().getText());

        Thread.sleep(1000);

        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
}
