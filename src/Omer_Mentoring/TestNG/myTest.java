package Omer_Mentoring.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class myTest {
    public static WebDriver driver;

    @BeforeClass
    public void beforeClass(){

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
    }

    @Test
    public void test1() throws InterruptedException {

        driver.findElement(By.name("firstname")).sendKeys("Tugba");
        driver.findElement(By.name("lastname")).sendKeys("Albas");
        driver.findElement(By.xpath("//input[@value='Female']")).click();

        List<WebElement> list=driver.findElements(By.cssSelector("input[name='exp']"));
        for (int i = 0; i < list.size(); i++) {
            list.get(i).click();
            Thread.sleep(1000);
        }



    }
}
