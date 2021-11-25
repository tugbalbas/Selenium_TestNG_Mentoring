package Hakan_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("Java");
        Thread.sleep(1000);

        driver.findElement(By.className("gNO89b")).click();
    }
}
