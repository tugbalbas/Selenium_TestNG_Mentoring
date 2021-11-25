package Hakan_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class neu {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pandakindermoebel.ch/");

        WebElement cookies=driver.findElement(By.xpath("//button[@aria-label='Akzeptiere alle']"));
        cookies.click();

        WebElement meinKonto=driver.findElement(By.xpath("(//span[text()='Mein Konto'])[2]"));
        meinKonto.click();

        WebElement registriren=driver.findElement(By.id("bb-show-register-button"));
        registriren.click();

        WebElement id=driver.findElement(By.id("reg_username"));
        id.sendKeys("Mesut");

        WebElement email=driver.findElement(By.id("reg_email"));
        email.sendKeys("tb@gmail.com");

        WebElement password=driver.findElement(By.id("reg_password"));
        password.sendKeys("W123456789.!91");

        WebElement neu=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        neu.click();

    }
}
