package Hakan_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_class_id {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://login.yahoo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("createacc")).click();
        driver.findElement(By.name("firstName")).sendKeys("Tom");

        Thread.sleep(1000);

        driver.findElement(By.id("usernamereg-lastName")).sendKeys("Cruse");

        Thread.sleep(1000);

        driver.findElement(By.id("usernamereg-yid")).sendKeys("hdemir");

        driver.findElement(By.id("usernamereg-password")).sendKeys("S2521214.");

        driver.findElement(By.name("shortCountryCode")).click();

        driver.findElement(By.id("usernamereg-phone")).sendKeys("1525437955");
    }
}
