package Hakan_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_class_LinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://login.yahoo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Forgot username?")).click();

        //driver.findElement(By.partialLinkText("Forgot"));

        driver.findElement(By.className("phone-no")).sendKeys("hakdem1212@gmail.com");

        driver.findElement(By.name("verifyYid")).click();
    }
}
