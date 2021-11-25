package Hakan_Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class alert {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.name("cusid")).sendKeys("Tugbaa");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        // Alert'in HTML kodlarına ulaşamıyoruz o yüzden;
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept(); //gettext veya dismiss de olur


        driver.quit();
    }
}
