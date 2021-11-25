package Hakan_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //elaman invisible olana kadar
        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
        WebDriverWait wait=new WebDriverWait(driver,10); // her zaman boolean
        Boolean x=wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//input[@type='checkbox']")));

        System.out.println(x);


    }
}
